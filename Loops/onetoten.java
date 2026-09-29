import java.util.*;
public class onetoten{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int Counter = sc.nextInt();

        while (Counter < 20) {
            System.out.println(Counter);

            Counter++;
        }

        sc.close();
    }
}