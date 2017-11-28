import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String player1, player2;
        int remove;
        int pileA = 3;
        int pileB = 4;
        int pileC = 5;
        int currentTurn = 1;
        String choice;

        System.out.print("Player 1, enter your name: ");
        player1 = keyboard.nextLine();
        System.out.print("Player 2, enter you name: ");
        player2 = keyboard.nextLine();
        System.out.println("");
        System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC + "\n");

        do {
            if (currentTurn == 1) {
                System.out.print(player1 + ", choose a pile: ");
                choice = keyboard.next();
                choice = keyboard.next();
                System.out.print("How many to remove from pile " + choice + ": ");
                remove = keyboard.nextInt();
                System.out.println("");
                currentTurn++;

                if (choice.equals("A"))
                    pileA -= remove;
                else if (choice.equals("B"))
                    pileB -= remove;
                else if (choice.equals("C"))
                    pileC -= remove;

                System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC + "\n");


            } else {
                System.out.print(player2 + ", choose a pile: ");
                choice = keyboard.next();
                System.out.print("How many to remove from pile " + choice + ": ");
                remove = keyboard.nextInt();
                System.out.println("");
                currentTurn--;

                if (choice.equals("A"))
                    pileA -= remove;
                else if (choice.equals("B"))
                    pileB -= remove;
                else if (choice.equals("C"))
                    pileC -= remove;

                System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC + "\n");
            }

        } while (pileA + pileB + pileC > 0);

        if (currentTurn == 1) {
            System.out.println(player1 + ", the last counter was taken by + " + player2 + ", so you WIN!");
        } else {
            System.out.println(player2 + ", the last counter was taken by + " + player1 + ", so you WIN!");
        }

    }
}
