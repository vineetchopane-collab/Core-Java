import java.util.*;
public class evenodd{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");

        int Number = sc.nextInt();

        if ( Number % 2 == 0) {
            System.out.println(Number +" is even number");
        }

        else {
            System.out.println(Number +" is odd number");
        }
        sc.close();
    }
}