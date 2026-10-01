public class CalculateSum{

    public static void main(String[] args){

        int Num = 157;
        int Temp = Num;
        int Sum = 0;

        while(Num != 0){

            int Digit = Num%10;
            Num = Num/10;

            Sum = Sum + Digit;
        }

        System.out.println("Sum of digits in " + Temp + " is: "+Sum);
    }
}