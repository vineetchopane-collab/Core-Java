public class ReverseNumber {
    
    public static void main(String[] args){

        int Num = 100;
        int Temp = Num;
        // int Sum = 0;
        int rev = 0;
        while(Num != 0){

            int Digit = Num%10;
             rev = rev*10+Digit;
             Num = Num/10;
        }

        System.out.println("Reverse of "+ Temp + " is : "+rev);
    }
}
