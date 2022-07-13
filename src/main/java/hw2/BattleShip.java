package hw2;

import java.util.Random;
import java.util.Scanner;

public class BattleShip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Enter the size for 2D Array: ");
        int size = input.nextInt();
        String[][] array = new String[size][size];
        String line = "-";
        int min = 1;
        int max = size - 1;
        int x = 0;

        System.out.println("All set. Get ready to rumble!");
        int numberOfRandoms = rnd.nextInt(size);


        String[][] arrayForView = new String[size][size];
        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j <= size - 1; j++) {
                arrayForView[0][j] = String.valueOf(j);
                arrayForView[i][0] = String.valueOf(i);
                for (int k = 1; k <= size - 1; k++) {
                    for (int l = 1; l <= size - 1; l++) {
                        arrayForView[k][l] = line;
                    }
                }
            }
        }


        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j <= size - 1; j++) {
                array[0][j] = String.valueOf(j);
                array[i][0] = String.valueOf(i);
                for (int k = 1; k <= size - 1; k++) {
                    for (int l = 1; l <= size - 1; l++) {
                        array[k][l] = line;
                    }
                }
            }
        }


        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j <= size - 1; j++) {
                String frontView = String.format(" %s |", array[i][j]);
                System.out.print(frontView);
            }
            System.out.println();
        }


        for (int i = 1; i <= numberOfRandoms; i++) {
            array[rnd.nextInt(max - min) + min][rnd.nextInt(max - min) + min] = "o";
        }
        System.out.println("");



        for (int k = 1; k <= size - 1; k++) {
            for (int l = 1; l <= size - 1; l++) {
                System.out.print("Enter indexes of 2D array: ");
                int a = input.nextInt();
                int b = input.nextInt();
                if (array[a][b].equals("o")) {
                    arrayForView[a][b] = "x";
                    x++;
                    print(arrayForView, size);
                } else {
                    arrayForView[a][b] = "*";
                    print(arrayForView, size);
                }

                if (x == numberOfRandoms) {
                    System.out.println("You have won!");
                    print(arrayForView, size);
                    k=size-1;
                    break;
                }
            }
        }
    }


    public static void print(String[][] arrayForView, int size) {
        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j <= size - 1; j++) {
                System.out.printf(" %s |", arrayForView[i][j]);
            }
            System.out.println();
        }
    }
}
