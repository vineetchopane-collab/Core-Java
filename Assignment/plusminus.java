import java.util.*;
public class plusminus{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int Number = sc.nextInt();

        if (Number > 0) {
            System.out.println("Number is positive");
        }
         else {
            System.out.println("Number is negaitve");
        }
           sc.close();
    }
}