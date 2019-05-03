import java.util.Scanner;

public class AscendingAndDesending {
    public static void main(String[] args) {
        int userEntryA;
        int userEntryB;
        int userEntryC;
        String result = null;
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to my game.");
        System.out.println("its called Ascending and Desending");
        System.out.print("Enter a whole number >>>>");
        userEntryA = input.nextInt();
        System.out.println("Enter a whole number >>>>");
        userEntryB = input.nextInt();
        System.out.println("Enter a whole number >>>>");
        userEntryC = input.nextInt();

        if (userEntryA > userEntryB && userEntryA > userEntryC ){
            if (userEntryB > userEntryC){
                result = userEntryA + " "+ userEntryB+ " "+ userEntryC;
            }
            else
                result = userEntryA + " "+ userEntryC + " "+ userEntryB;
        }
else if (userEntryB > userEntryA && userEntryB > userEntryC){
            if (userEntryA > userEntryC){

            }
            else
                result = userEntryB + " " + userEntryC+" "+ userEntryC;
        }
 //if (userEntryA = 1);
        //userEntryA wins;
    }
}
