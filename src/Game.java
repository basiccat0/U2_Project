import java.util.Scanner;
public class Game {
    public static int end = 0;
    int loop = 9;
    public void cardGame() {
        System.out.println("__________ Pick a number from range of two numbers. Be careful though as if you choose the wrong number, you lose! __________");
        Scanner scan = new Scanner(System.in);
        while (loop > 0) {
            if (loop == 9 || loop == 8 || loop == 7) {
                int randomNum = (int) (Math.random() * 4);
                System.out.println("Choose a number between 1 and 5");
                int chosenNum = scan.nextInt();
                if (chosenNum != randomNum && (chosenNum == 1 || chosenNum == 2 || chosenNum == 3 || chosenNum == 4 || chosenNum == 5)) {
                    System.out.println("Again!");
                    System.out.println(randomNum);
                } else {
                    System.out.println("You chose the wrong number! Game Over :(");
                    System.exit(0);
                }
                loop --;
            } else if (loop == 6 || loop == 5 || loop == 4) {
                int randomNum = (int) (Math.random() * 3);
                System.out.println("Now choose a number between 1 and 4");
                int chosenNum = scan.nextInt();
                if (chosenNum != randomNum && (chosenNum == 1 || chosenNum == 2 || chosenNum == 3 || chosenNum == 4)) {
                    System.out.println("Again!");
                } else {
                    System.out.println("You chose the wrong number! Game Over :(");
                    System.exit(0);
                }
                loop --;
            } else if (loop == 3 || loop == 2) {
                int randomNum = (int) (Math.random() * 2) + 1;
                System.out.println("Choose a number between 1 and 3");
                int chosenNum = scan.nextInt();
                if (chosenNum != randomNum && (chosenNum == 1 || chosenNum == 2 || chosenNum == 3)) {
                    System.out.println("Again!");
                } else {
                    System.out.println("You chose the wrong number! Game Over :(");
                    System.exit(0);
                }
                loop --;
            } else if (loop == 1) {
                int randomNum = (int) (Math.random() * 2) + 1;
                System.out.println("Choose a number between 1 and 2");
                int chosenNum = scan.nextInt();
                if (chosenNum != randomNum && (chosenNum == 1 || chosenNum == 2)) {
                    System.out.println("Again!");
                } else {
                    System.out.println("You chose the wrong number! Game Over :(");
                    System.exit(0);
                }
                loop --;
            }
            end = loop;
        }
    }
    public void calculatePercentages () {
        double result = .8;
        for (int length = 0; length <= end - 1; length ++) {
            if (length == 1 || length == 2) {
                result *= .8;
            } else if (length == 3 || length == 4 || length == 5) {
                result *= .75;
            } else if (length == 6 || length == 7) {
                result *= .67;
            } else if (length == 8) {
                result *= .5;
            }
        }
        System.out.println("It was a " + result + "chance you lost!");
    }
}