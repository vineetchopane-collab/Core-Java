public class Bike {

    // Non-static Method 

    String ModelName;
    int cc;
    double price;

    // Non-static methods 

    public void drive(){
        System.out.println("Driving Motorcycle");
    }

    public void fuel(){
        System.out.println("Filling Petrol");
    }

    // Instance Initializer Block 

    {
        System.out.println("IIB of class Bike");
    }

    Bike(){
              System.out.println("Bike() Constructor");
    }
    
    public static void main(String[] args){

        Bike B1 = new Bike();
        Bike B2 = new Bike();

        B1.drive();
        B2.fuel();
    }
}
