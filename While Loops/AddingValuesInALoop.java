import java.util.Scanner;

public class AddingValuesInALoop{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int userNumber;
        int total = 0;

        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        userNumber = keyboard.nextInt();

        while (userNumber != 0) {
            total += userNumber;
            System.out.println("The total so far is " + total);
            System.out.print("Number: ");
            userNumber = keyboard.nextInt();

        }
        System.out.println("\nThe total is " + total);


    }
}
