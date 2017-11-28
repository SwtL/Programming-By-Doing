import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int side1, side2, side3;
        double checkTriangle;

        System.out.println("Enter three integers:");
        System.out.print("Side 1: ");
        side1 = keyboard.nextInt();

        while (side1 <= 0) {
            System.out.println("A side cannot be less than or equal to 0. Try again.");
            System.out.println("Side 1: ");
            side1 = keyboard.nextInt();
        }

        System.out.print("Side 2: ");
        side2 = keyboard.nextInt();

        while (side2 < side1) {
            System.out.println(side2 + " is smaller than " + side1 + ". Try again.");
            System.out.print("Side 2: ");
            side2 = keyboard.nextInt();
        }

        System.out.print("Side 3: ");
        side3 = keyboard.nextInt();

        while (side3 < side2) {
            System.out.println(side3 + " is smaller than " + side2 + ". Try again.");
            System.out.print("Side 3: ");
            side3 = keyboard.nextInt();
        }

        System.out.println("\nYour three sides are " + side1 + " " + side2 + " " + side3 + ".");
        checkTriangle = Math.sqrt(side1 * side1 + side2 * side2);

        if (checkTriangle == side3) {
            System.out.println("These sides *do* make a right triangle. Yippy-skippy!");
        } else if (checkTriangle != side3) {
            System.out.println("NO! These sides do not make a right triangle!");
        }


    }
}
