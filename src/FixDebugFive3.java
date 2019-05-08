// FixDebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department

import java.util.Scanner;
public class FixDebugFive3
{
    public static void main (String args[])
    {
    }
        int item;
        String output;
        final int LOW = 111;
        final int HIGH = 9;
        final int CUTOFF = 500;
        Scanner input = new Scanner(System.in);
        calculateOutPut();

    }
    public static void calculateOutPut()
    {
        if ( item == random) {
            System.out.println("Guessed correctly !!! Connor has your prize out back");
        } else if (userGuess > random) {
            System.out.println("Wrong number it was to high ");
        } else if (userGuess < random) {
            System.out.println("Wrong number it was to low ");
        } else {
            System.out.println("That number was outside the range of 1-10 ");
        }
        count = count + 1;
    }

