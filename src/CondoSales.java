import java.util.Scanner;

public class CondoSales {

    public static void main(String[] args){
        int userPick1;
        int userPick2;

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want a 1 car garage or a 2 car parking space?");
        System.out.println("if you get the 2 car parking space you have to pay 5,000 extra");
         userPick1 = input.nextInt();
         userPick2 = input.nextInt();

        if (userPick1 == 1 ) {
            System.out.println("You get a 1 car garage with a city view.");
        }
            else if (userPick2 == 2){
            System.out.println("You picked a 2 car parking spot but you had to pay 5,000 and you have a good view of the city ");
        }

    }
}
