import java.util.*;
public class even{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println(number+ " Number is even");
        }

        else{
            System.out.println(number +" Number is odd");
        }

        sc.close();
    }
}