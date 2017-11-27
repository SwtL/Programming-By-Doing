//n++ adds 1 to the value of n. (same as doing n + 1)
import java.util.Scanner;

public class CountingWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String message = "";
        int counter = 0;
        int timesToRun;

        System.out.println("Type in a message, and I'll display it several times.");
        System.out.print("Message: ");
        message = keyboard.nextLine();

        System.out.print("How many times? ");
        timesToRun = keyboard.nextInt();

        while (counter < (timesToRun*10)) {
            System.out.println((counter + 10) + ". " + message);
            counter = counter + 10;
        }
    }
}

