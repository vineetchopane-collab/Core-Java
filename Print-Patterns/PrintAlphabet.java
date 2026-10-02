public class PrintAlphabet{
    public static void main(String[] args){

        int N = 5;

        for(int i=1; i<=N; i++){

            char ch = 'A';

            for(int j=1; j<=N; j++){

                if(i>=j){

                    System.out.print(ch++ + " ");
                }

                else{
                    
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}