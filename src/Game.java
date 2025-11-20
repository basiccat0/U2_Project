import java.util.Scanner;
public class Game {
    public static int end = 0;
    int loop = 9;
    public void cardGame() {
        System.out.println("__________ Pick a number from range of two numbers. Be careful though as if you choose the wrong number, you lose! __________");
        Scanner scan = new Scanner(System.in);
        while (loop > 0) {
            if (loop == 9 || loop == 8 || loop == 7) {
                int randomNum = (int) (Math.random() * 4) + 1;
                System.out.println("Choose a number between 1 and 5");
                int chosenNum = scan.nextInt();
                if (chosenNum == randomNum || chosenNum != 1-5) {
                    System.out.println("You chose the wrong number! Game Over :(");
                }
                loop --;
            } else if (loop == 6 || loop == 5 || loop == 4) {
                int randomNum = (int) (Math.random() * 3) + 1;
                System.out.println("Choose a number between 1 and 4");
                int chosenNum = scan.nextInt();
                if (chosenNum == randomNum || chosenNum != 1-4) {
                    System.out.println("You chose the wrong number! Game Over :(");
                    System.exit(0);
                }
                loop --;
            } else if (loop == 3 || loop == 2) {
                int randomNum = (int) (Math.random() * 2) + 1;
                System.out.println("Choose a number between 1 and 3");
                int chosenNum = scan.nextInt();
                if (chosenNum == randomNum || chosenNum != 1-3 ) {
                    System.out.println("You chose the wrong number! Game Over :(");
                    System.exit(0);
                }
                loop --;
            } else if (loop == 1) {
                int randomNum = (int) (Math.random() * 2) + 1;
                System.out.println("Choose a number between 1 and 2");
                int chosenNum = scan.nextInt();
                if (chosenNum == randomNum || chosenNum != 1-2 ) {
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
        for (int length = end - 1; length <= end - 1; length++) {
            result *= .8;
        }

    }
}