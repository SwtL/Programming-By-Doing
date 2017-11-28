import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int number;
        int count = 0;
        int largestNumber = 0;
        int temp = 0;

        System.out.print("Starting number: ");
        number = keyboard.nextInt();
        largestNumber = 0;
        System.out.print(number + "\t");

        do {
            if (number == 0) {
                System.out.println("ERROR! NUMBER CANNOT BE 0!");
                System.out.print("Starting number: ");
                number = keyboard.nextInt();
            } else if ((number % 2) == 0) {
                number /= 2;
                System.out.print(number + "\t");
                count++;
            } else if ((number % 2) != 0) {
                number = (number * 3) + 1;
                System.out.print(number + "\t");
                count++;
            }
            if (number > largestNumber) {
                largestNumber = number;
            }
        } while (number != 1);

        System.out.println("\n\nTerminated after " + count + " steps.");
        System.out.println("The largest value was " + largestNumber + ".");


    }
}
