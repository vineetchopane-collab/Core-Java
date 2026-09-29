import java.util.*;
public class prime{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N == 2){
            System.out.println("N is prime number");
        }

        else{
            boolean isPrime = true;
            for(int i=2; i<=N-1; i++){
                if(N % i == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("N is prime number");
            }

            else{
                System.out.println("N is not prime number");
            }
        }

        sc.close();
    }
}