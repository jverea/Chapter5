import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        int userGuess;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.\n");
        System.out.println("Pic a number between 1 to 10\n ");
        System.out.println("Guess correctly win a prize.\n");
        System.out.println("Pic a Number>>>");
        userGuess = input.nextInt();

        int random = (int) (Math.random() * 10 + 1);
        while (userGuess != random)
        {
            if (userGuess == random) {
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
    }
}
