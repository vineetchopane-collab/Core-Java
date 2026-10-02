public class Sqaure {
    public static void main(String args[]) {

        int N = 5;

        for(int i = 1; i <= N; i++) {

            for(int j = 1; j <= N; j++) {

                if( i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(" * ");
                }

                else {
                    System.out.print("   ");
                }
            }   
            System.out.println();  
        }       
    }
}