import java.util.Scanner;

import static java.lang.Math.random;

public class Game {
    public static int end = 0;
    int loop = 9;


    public void cardGame() {
        System.out.println("You just entered into a casino with all the money to your name! A single crisp hundred dollar bill...");
        System.out.println("Not to worry though as the manager has offered you a once in a lifetime deal! For every round you win in this luck based game, he'll tack on a zero at the end onto that 100 dollars, letting you win up to a million dollars!");
        System.out.println("Just don't choose the same number as the randomizer! How much will you win?");
        Scanner scan = new Scanner(System.in);
        while (loop > 0) {
            if (loop == 9 || loop == 8 || loop == 7) {
                int randomNum = (int) (Math.random() * 5) + 1;
                System.out.println("Alright now choose a number between 1 and 5");
                int chosenNum = scan.nextInt();
                if (chosenNum == randomNum || chosenNum < 1 || chosenNum > 5) {
                    System.out.println("You chose the wrong number! You won literally nothing");
                    System.out.println("Game Over :(");
                    System.exit(0);
                }
                System.out.println("Again!");
                loop--;

                } else if (loop == 6 || loop == 5 || loop == 4) {
                int randomNum = (int) (Math.random() * 4) + 1;
                System.out.println("Now choose a number between 1 and 4");
                int chosenNum = scan.nextInt();
                if (chosenNum == randomNum || chosenNum < 1 || chosenNum > 4) {
                    System.out.println("You chose the wrong number! You walk away with $1,000");
                    System.out.println("Game Over :(");
                    System.exit(0);
                }

                System.out.println("Again!");
                loop--;

                } else if (loop == 3 || loop == 2) {
                int randomNum = (int) (Math.random() * 3) + 1;
                System.out.println("Choose a number between 1 and 3");
                int chosenNum = scan.nextInt();
                if (chosenNum == randomNum || chosenNum < 1 || chosenNum > 3) {
                    System.out.println("You chose the wrong number! You have 10,000 dollars now!");
                    System.out.println("Game Over :(");
                    System.exit(0);
                }

                System.out.println("Again!");
                loop--;
                }
                else if (loop == 1) {
                    int randomNum = (int) (Math.random() * 2) + 1;
                     System.out.println("Choose a number between 1 and 2");
                    int chosenNum = scan.nextInt();
                if (chosenNum == randomNum || chosenNum < 1 || chosenNum > 2) {
                    System.out.println("So close, but you still have 100,000 :)");
                    System.exit(0);
                }

                System.out.println("Again!");
                loop--;
                }
            end = loop-1;
            System.out.println("You win the million dollars :)");
        }

    }
    public void calculatePercentages () {
        double result = 1;
        for (int length = 0; length < end - 1; length ++) {
            if (length == 1 || length == 2) {
                result *= .2;
            } else if (length == 3 || length == 4 || length == 5) {
                result *= .25;
            } else if (length == 6 || length == 7) {
                result *= .33;
            } else if (length == 8) {
                result *= .5;
            }
            if (length == end - 1) {
                result *= .2;
            }
        }
        System.out.println("It was a " + (result * 100) + "% chance you lost!");
    }
}