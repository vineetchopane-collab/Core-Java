public class SumOfDigits {
    public static void main(String[] args){

        int Num = 369;
        int Temp = Num;
        int Sum = 0;

        while(Num != 0){

            int Digit = Num%10;
            Sum = Sum+Digit;
            Num = Num/10;
        }

        System.out.println("Sum of digits " + Temp + " is : " + Sum);
    }
}
