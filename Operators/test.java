public class test{
    public static void main(String args[]){
        int x=200, y=50, z=100;

        if(x > y && z > x){
            System.out.println("Hello");
        }

        if(y < x && x > z){
            System.out.println("Java");
        }

        if(z > x && y < x){
            System.out.println("OK");
        }
    }
}