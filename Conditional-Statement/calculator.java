import java.util.*;
public class calculator{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A : ");
        int A = sc.nextInt();

        System.out.println("Enter B : ");
        int B = sc.nextInt();

        System.out.println("Enter your operator : ");
        char operator = sc.next().charAt(0);

       switch(operator){

        case '+' : System.out.println(A+B);
                  break;

        case '-' : System.out.println(A-B);
                 break;

        case '*' : System.out.println(A*B);
                 break;
                 
        case '/' : System.out.println(A/B);
                 break;
                 
        case '%' : System.out.println(A%B);
                 break;
                 
        default : System.out.println("Wrong Operator");
        
        sc.close();

       }
    }
}