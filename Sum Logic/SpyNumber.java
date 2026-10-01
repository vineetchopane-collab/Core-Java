public class SpyNumber {

    public static void main(String[] args){

        int Num = 123;
        int Temp = Num;
        int Sum = 0;
        int Product = 1;

        while(Num != 0){

            int Digit = Num % 10;

            Sum = Sum + Digit;
            Product = Product * Digit;

            Num = Num / 10;
        }

        if(Sum == Product){

            System.out.println(Temp + " is spy number");
        }

        else{

            System.out.println(Temp + " is not spy number");
        }
    }
}





// |   Number | Sum of digits | Product of digits | Spy Number? |
// | -------: | ------------: | ----------------: | ----------- |
// |  **123** |     1+2+3 = 6 |         1×2×3 = 6 | ✅ Yes      |
// | **1124** |   1+1+2+4 = 8 |       1×1×2×4 = 8 | ✅ Yes      |
// |   **22** |       2+2 = 4 |           2×2 = 4 | ✅ Yes      |
// |   **13** |       1+3 = 4 |           1×3 = 3 | ❌ No       |
// | **1234** |  1+2+3+4 = 10 |      1×2×3×4 = 24 | ❌ No       |
// |   **25** |       2+5 = 7 |          2×5 = 10 | ❌ No       |
