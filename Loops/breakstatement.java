import java.util.*;
public class breakstatement{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a number");

            int N = sc.nextInt();
            if(N % 10 == 0){
                break;
            }
            System.out.println(N);
        }while(true);

        sc.close();
    }
}