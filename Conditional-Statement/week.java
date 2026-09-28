import java.util.*;
public class week{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any week number (1 to 7):");
        int Week = sc.nextInt();

        switch(Week){

            case 1 : System.out.println("Monday");
               break;

             case 2 : System.out.println("Tuesday");
               break;

             case 3 : System.out.println("Wednesday");
               break;

             case 4 : System.out.println("Thursday");
               break;

             case 5 : System.out.println("Friday");
               break;

             case 6 : System.out.println("Saturday");
               break;

             case 7 : System.out.println("Sunday");
               break;

             default : System.out.println("Invalid input ! Please enter week number from (1 to 7)");
        }
        sc.close();
    }
}