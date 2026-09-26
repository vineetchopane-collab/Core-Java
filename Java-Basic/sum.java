// public class sum{
//     public static void main(String args[]){
//         int a=10;
//         int b=5;
//         int sum=(a+b);
//         System.out.println(sum);
//     }
// }

import java.util.*;
public class sum{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        //  String input = sc.next();        // next() will print only one word after writing any word if, I leave any space and write one more word it will not get printed. 
        //  System.out.println(input);

        // String name = sc.nextLine();    // In nextLine(), if we write any big word or sentence it will get printed 
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);

        sc.close();
    }
}