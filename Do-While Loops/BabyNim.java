import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        int remove;
        String choice = "";

        do {
            System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC);
            System.out.print("\nChoose a pile: ");
            choice = keyboard.next();
            System.out.print("How many to remove from pile " + choice + ": ");
            remove = keyboard.nextInt();
            System.out.println("");

            if (choice.equals("A")) {
                pileA -= remove;
            } else if (choice.equals("B")) {
                pileB -= remove;
            } else if (choice.equals("C")) {
                pileC -= remove;
            }
        } while (pileA + pileB + pileC > 0);

        System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC);
        System.out.println("All piles are empty. Good job!");
    }
}
