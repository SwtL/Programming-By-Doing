//Q1) Goofus and Gallant both swim for 4 minutes.

//Q2) Gallant no longer swims, and Goofus swims for 1 minutes before stopping.

//Q3) Gallant does check the temperature, which is why he doesn't swim
// at all when the temp is set to 78.

//Q4) Goofus does not check the temperature until he has dived in.

//Q5)  A while loop checks the condition first, then executes code,
// whilst a do while loop runs code and then checks the condition.

//Q6) Gallant uses a pre-test loop, he checks the temperature BEFORE he dives in,
//where-as Goofus uses a post-test loop, he checks the temperature after he dives in.

import java.util.Scanner;

public class DoWhileSwimming
{
    public static void main( String[] args ) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);

        String swimmer1 = "GALLANT";
        String swimmer2 = "GOOFUS ";

        double minimumTemperature = 79.0; // degrees Fahrenheit
        double currentTemperature;
        double savedTemperature;
        int swimTime;

        System.out.print("What is the current water temperature? ");
        currentTemperature = keyboard.nextDouble();
        savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

        System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer1 + " approaches the lake...." );

        swimTime = 0;
        while ( currentTemperature >= minimumTemperature )
        {
            System.out.print( "\t" + swimmer1 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600); // pauses for 600 milliseconds
            currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
        }

        System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

        currentTemperature = savedTemperature; // restores original water temperature

        System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer2 + " approaches the lake...." );

        swimTime = 0;
        do
        {
            System.out.print( "\t" + swimmer2 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600);
            currentTemperature -= 0.5;
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

        } while ( currentTemperature >= minimumTemperature );

        System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
    }
}