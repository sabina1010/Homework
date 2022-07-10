package homework1;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int[] array = new int[30];
        int revArrSize;
        int iteration = 0;
        int inputNumber;
        int randomNumber;
        boolean repeat;


        System.out.print("Please, enter your name: ");
        String name = in.nextLine();
        System.out.println(" Let the game begin! ");

        do {
            System.out.println("random number is: ** ");
            randomNumber = rnd.nextInt(100);

            do {
                System.out.print("Please, enter the number: ");

                inputNumber = in.nextInt();
                array[iteration] = inputNumber;
                iteration++;
                revArrSize=iteration;

                if (inputNumber> randomNumber) {
                    System.out.println("Your number is too big, please try again.");
                } else if (inputNumber< randomNumber) {
                    System.out.println("Your number is too small. Please, try again");
                } else if (inputNumber== randomNumber) {
                    System.out.println(" Congratulations, " + name );
                }
            }while( randomNumber!=inputNumber);

            repeat = true;
            if (repeat) {
                System.out.println("Do you want to begin? \n YES - press 1    ||    NO  - press 0:  ");
                int selectNum = in.nextInt();

                if (selectNum == 0) {
                    int [] view = Arrays.copyOfRange(array,0,revArrSize);
                    int [] reversedView = new int[revArrSize];
                    Arrays.sort(view);

                    for (int i = 0; i <= view.length-1; i++) {
                        reversedView[i] =  view[view.length-1-i];
                    }

                    System.out.println("\n\nYour inputs: "+ Arrays.toString(reversedView));

                    System.out.println(" End of the Game! ");
                    break;
                }
            }
        }while (true);
    }



}

