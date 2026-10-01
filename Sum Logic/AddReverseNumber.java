public class AddReverseNumber {
    public static void main(String[] args){

        int Num = 157;
        int Temp = Num;
        int Count = 0;

        while(Num != 0){

            Count++;
            Num = Num/10;
        }

        System.out.println("Count of digits int " + Temp +" is : "+ Count);
    }
}
