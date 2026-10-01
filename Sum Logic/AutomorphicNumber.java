public class AutomorphicNumber {
    
    public static void main(String args[]){

        int Num = 7;
        int Temp = Num;
        int Sqaure = Num * Num;

        int Divisor = 1;

        while(Num != 0){

            Divisor = Divisor*10;
            Num = Num/10;
        }

        if(Temp == Sqaure % Divisor){

            System.out.println(Temp + " is automorphic number");
        }

        else{

            System.out.println(Temp + "is not automorphic number");
        }
    }
}
