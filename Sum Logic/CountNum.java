public class CountNum{

    public static void main(String[] args){

        int Num = 157;
        int Temp = Num;
        int Count = 0;

        while(Num != 0){

            Count++;

            Num = Num/10;
        }

        System.out.println("Count of digits in " + Temp + " is: "+Count);
    }
}







// | Step      | `Num` before | `Num != 0` | `Count++` | `Count` after | `Num = Num/10` | `Num` after |
// | --------- | -----------: | ---------- | --------- | ------------: | -------------: | ----------: |
// | Start     |          157 | —          | —         |             0 |              — |         157 |
// | 1st loop  |          157 | `true`     | 0 → 1     |             1 |       157 / 10 |          15 |
// | 2nd loop  |           15 | `true`     | 1 → 2     |             2 |        15 / 10 |           1 |
// | 3rd loop  |            1 | `true`     | 2 → 3     |             3 |         1 / 10 |           0 |
// | 4th check |            0 | `false`    | ❌        |             3 |              — |           0 |
