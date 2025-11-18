import java.util.Scanner;
public class Game {
    public void cardGameIntro() {
        System.out.println("__________ Pick a number from range of two numbers. Be careful though as if you choose the wrong number, you lose! __________");
        Scanner scan = new Scanner(System.in);
        for (int loop = 9; loop > 1; loop --) {
            if (loop == 9 || loop == 8 || loop == 7) {
                int randomNum1 = ((int) Math.random() * 4) + 1;
                System.out.println("Choose a number between 1 and  5");
            }
        }
    }
}
