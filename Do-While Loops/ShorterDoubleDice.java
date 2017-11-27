import java.util.Random;

public class ShorterDoubleDice {
    public static void main(String[] args) {
        Random r = new Random();
        int firstRoll, secondRoll;
        int total = 0;
        int count = 0;

        System.out.println("HERE COME THE DICE!\n");

        do {
            firstRoll = 1 + r.nextInt(100000000);
            secondRoll = 1 + r.nextInt(100000000);
            System.out.println("Roll #1: " + firstRoll);
            System.out.println("Roll #2: " + secondRoll);
            total = firstRoll + secondRoll;
            System.out.println("The total is " + total + "!\n");
            count++;
        } while (firstRoll != secondRoll);
        System.out.println("Count is " + count + ".");
    }
}
