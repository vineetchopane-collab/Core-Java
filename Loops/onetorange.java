import java.util.*;
public class onetorange{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int range = sc.nextInt();
        int Counter = 1;

        while( Counter <= range){
            System.out.println(Counter);
            Counter++;

            sc.close();
        }

    }
}
