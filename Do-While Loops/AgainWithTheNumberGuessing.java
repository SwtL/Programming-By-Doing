import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int randomNumber = 1 + r.nextInt(10);
        int numberGuess;
        int counter = 1;

        System.out.println("I have chosen a number netween 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        numberGuess = keyboard.nextInt();


        if (numberGuess == randomNumber) {
            System.out.println("That's right! You're a good guesser.");
            System.out.println("It only took you " + counter + " try.");

        } else {
            do {
                System.out.println("That is incorrect. Guess again.");
                System.out.print("Your guess: ");
                numberGuess = keyboard.nextInt();
                counter++;
            } while (numberGuess != randomNumber);
            System.out.println("That's right! You're a good guesser.");
            System.out.println("It only took you " + counter + " tries.");
        }
    }
}