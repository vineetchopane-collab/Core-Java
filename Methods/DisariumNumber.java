public class DisariumNumber {

    public static int CountDigit(int num) {

        int Count = 0;

        while(num != 0) {

            Count++;

            num /= 10;
        }

        return Count;
    }

    public static int Power(int x, int n) {

        int power = 1;

        for(int i = 1; i <= n; i++) {

            power *= x;
        }

        return power;
    }

    public static void main(String[] args) {

        int Num = 135;
        int Temp = Num;
        int Sum = 0;
        int Count = CountDigit(Num);

        while(Num != 0) {

            int Digit = Num % 10;

            Sum = Sum + Power(Digit, Count);

            Count--;

            Num /= 10;
        }

        if(Sum == Temp) {

            System.out.println(Temp + " is a Disarium number");
        }

        else {

            System.out.println(Temp + " is not a Disarium number");
        }
    }
}