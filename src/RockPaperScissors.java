import java.util.Scanner;

public class RockPaperScissors {

    public static void main (String [] args){

        int user;
        String result = null;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a whole number >>>");
        System.out.println("1) For rock");
        System.out.println("2) For paper");
        System.out.println("3) For scissors");
        user = input.nextInt();

        int random = (int) (Math.random() * 3 + 1);
        while (user != 999)
        {
            if (user == 1) {
                if (random == 1)
                    result = "Tie";
                else if (random == 2)
                    result = "Lose";
                else
                    result = "Win";
            }else if (user == 2) {
                if (random == 1){
                    result = "Win";
                }
                //result of winner or loser
            } else if (user == 3){
            }
        }
    }
}