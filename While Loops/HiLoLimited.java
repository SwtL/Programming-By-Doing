import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int randomNumber = 1 + r.nextInt(100);
        int numberOfGuesses = 0;
        int maxGuesses = 7;
        int userGuess;

        System.out.println("I'm thinking of a number between 1-100. You have " + maxGuesses + " guesses.");
        System.out.print("First guess: ");
        userGuess = keyboard.nextInt();
        numberOfGuesses++;

        while (userGuess != randomNumber && numberOfGuesses < maxGuesses) {
            if (userGuess < randomNumber) {
                System.out.println("Sorry, you are too low.");
                numberOfGuesses++;
                System.out.print("Guess # " + numberOfGuesses + ": ");
                userGuess = keyboard.nextInt();
            } else if (userGuess > randomNumber) {
                System.out.println("Sorry, that guess is too high.");
                numberOfGuesses++;
                System.out.print("Guess # " + numberOfGuesses + ": ");
                userGuess = keyboard.nextInt();
            }
        }
        if (userGuess == randomNumber) {
            System.out.println("You guessed it! What are the odds?!?");
        } else if (numberOfGuesses >= maxGuesses) {
            System.out.println("Sorry, you didn't guess it in " + maxGuesses + " tries. You lose.");
        }
    }
}
