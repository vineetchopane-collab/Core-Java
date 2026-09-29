public class continuestatement{
    public static void main(String args[]){

        for(int i=1; i<=10; i++){
            if (i == 3) {
                continue;          // Continue statement is used to skip iterator if we write i == 3 it will skip 3 and print numbers till 10
            }
            System.out.println(i);
        }
    }
}