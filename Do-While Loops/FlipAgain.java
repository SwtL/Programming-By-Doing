//Q3) The program does still work, as after changing to a do-while loop,
//    the code runs, then checks for the condition after every run,
//    rather than checking for the condition before.

import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();

        String again;

        do {
            int flip = rng.nextInt(2);
            String coin;

            if (flip == 1)
                coin = "HEADS";
            else
                coin = "TAILS";

            System.out.println("You flip a coin and it is... " + coin);

            System.out.print("Would you like to flip again (y/n)? ");
            again = keyboard.next();
        } while (again.equals("y"));
    }
}
