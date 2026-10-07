import java.util.Scanner;

public class StrongNumber {

    public static int Factorial(int num) {

        int Fact = 1;

        for (int i = 1; i <= num; i++) {
            Fact *= i;
        }

        return Fact;
    }

    public static boolean isStrong(int num) {

        int temp = num;
        int Sum = 0;

        while (num != 0) {

            int Digit = num % 10;
            Sum = Sum + Factorial(Digit);

            num = num / 10;
        }

        return temp == Sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers:");

        for (int i = 1; i <= 1; i++) {

            int num = sc.nextInt();

            System.out.println(
                isStrong(num)
                ? num + " is Strong Number"
                : num + " is not Strong Number"
            );
        }

        sc.close();   
    }
}