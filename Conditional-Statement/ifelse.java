import java.util.*;
public class ifelse{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age > 17){
            System.out.println("You can Drive");
        }

        else if(age > 13 && age < 18){
            System.out.println("You are a teenager");
        }

        else{
            System.out.println("You cannot Drive");
        }

        sc.close();
    }
}