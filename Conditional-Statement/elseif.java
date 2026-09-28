import java.util.*;
public class elseif{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = sc.next();

        System.out.println("Enter Your age: ");
        int age = sc.nextInt();


        if(age >= 18){
            System.out.println(name + " is an adult");
        }

        else if(age >= 13 && age < 18){
            System.out.println(name + " is an Teenager");
        }

        else{
            System.out.println( name + " is an Child");
        }
        sc.close();
    }
}