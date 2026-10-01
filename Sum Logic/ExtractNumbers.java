public class ExtractNumbers{
    public static void main(String[] args){

        int Num = 157;

        while(Num != 0){

            int digit = Num%10;
            System.out.println(digit);

            Num = Num/10;
        }
    }
}