import java.util.*;
public class eeven {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int Number = sc.nextInt();

        if(Number %2 == 0){

            System.out.println(Number + " is even number");
        }

        else{

            System.out.println(Number + " is odd number");
        }

        sc.close();
    }
}