public class NonSataticExample{
    String Name = "Vineet";

    public void m1(){

        String Name = "Chopane";
        System.out.println(Name);          // local variable
    }

    NonSataticExample(){

        System.out.println(Name);    // Non stativ variable
    }

    public static void main(String[] args){

        NonSataticExample ns = new NonSataticExample();
        ns.m1();
    }
}