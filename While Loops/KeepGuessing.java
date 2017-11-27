import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int randomNumber = 1 + r.nextInt(10);
        int numberGuess;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        numberGuess = keyboard.nextInt();

        while (numberGuess != randomNumber) {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            numberGuess = keyboard.nextInt();
        }
        System.out.println("That's right! You're a good guesser.");
    }
}
