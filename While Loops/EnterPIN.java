import java.util.Scanner;

public class EnterPIN {
    public static void main(String[] args) {

        //Q1) A while loop is similar to an if statement because the code within is
        // only run if the output is true.

        //Q2) A while loop is different because if the codition outputs false, then
        // all code within is skipped completely and not run.

        //Q3) Inside the while loop, there is not an int in front of entry because
        // entry is already defined, and is being redefined with the loop statement.

        //Q4) If the entry = keyboard.nextInt(); is deleted from within the while loop,
        // then entry does not get redefined by the user typing in another PIN, and will
        //continuously loop between ENTER YOUR PIN and INCORRECT PIN.

        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int entry;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();

        while (entry != pin) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}