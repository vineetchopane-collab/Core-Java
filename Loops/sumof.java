import java.util.*;
public class sumof{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int N=sc.nextInt();

        int Sum=0;
        int i=1;

        while(i<=N){
            Sum+=i;
            i++;

            System.out.println("Sum is "+Sum);
        }

        sc.close();
    }
}