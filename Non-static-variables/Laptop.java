public class Laptop {

    // Non-static-variables 

    String BrandName;
    int Ram;
    int Storage;

    {
        BrandName = "Lenovo";
        Ram = 8;
        Storage = 1;
    }

    {
        System.out.println("IIB");
    }

    Laptop(){
               System.out.println("Laptop() Constructor");
    }

    public static void main(String[] args){

        System.out.println("Main() Started");

        Laptop L1 = new Laptop();

        System.out.println(L1.BrandName);
        System.out.println(L1.Ram);
        System.out.println(L1.Storage);

        System.out.println("Main() Ended");
    }
}
