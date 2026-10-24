import java.util.*;
public class percentagecalculator{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int S1,S2,S3,S4,S5;
        int TotalMarks;
        float Percentage;
        String Name;

        
        System.out.println("Enter your name:");
        Name=sc.next();

        System.out.println("Enter marks (out of 100):");
     
            S1=sc.nextInt();
            S2=sc.nextInt();
            S3=sc.nextInt();
            S4=sc.nextInt();
            S5=sc.nextInt();


            TotalMarks=(S1+S2+S3+S4+S5);
            Percentage=(TotalMarks/500.0f)*100;

            if ( TotalMarks < 175) {
                System.out.println(Name+ " you have lost your academic year.");
            } 
            
            else {
                 System.out.println(Name+" Your Marks out of 500: "+ TotalMarks);
                 System.out.println(Name+" Your Percenatge "+ Percentage+"%");
            }

            sc.close();
    }
}