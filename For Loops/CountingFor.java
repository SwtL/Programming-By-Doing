//Q1) n = n+1 takes the value of n, adds 1, then stores the result as a new n value.
//Q2} n = 1 stores the value 1 in n. It starts the counter from 1, and stops when reaches 5.

import java.util.Scanner;

public class CountingFor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String message;

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        message = keyboard.nextLine();

        for (int n = 2; n <= 10; n = n + 2) {
            System.out.println(n + ". " + message);
        }
    }
}
