import java.util.*;
public class marks {
    public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();

        // if (A >= 33) {
        //     System.out.println("Student is Passed");
        // }

        // else{
        //     System.out.println("Student is failed");
        // }
        // sc.close();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student name: ");

        String name = sc.next();

        System.out.println("Enter your Marks: ");

        int marks = sc.nextInt();

        if ( marks >= 33) {
            System.out.println(name + " is passed");
        }

        else{
            System.out.println(name + " is failed");
        }

        sc.close();
    }
}
