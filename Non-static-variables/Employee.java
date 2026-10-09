public class Employee {

    // Non-static-varaiables 

    String Name = "Vineet Chopane";
    int Empid;
    String JobRole;

    // Insatcne Initializer Block (IIB)

    {
        Empid =  21;
        JobRole = "Developer";
        System.out.println("IIB1");
    }

    {
        System.out.println("IIB2");
    }

    Employee(){

        System.out.println("Employee Constructor");
    }

    public static void main(String[] args){

        System.out.println("Main() Started");

        Employee e1 = new Employee();
        System.out.println(e1);

        System.out.println(e1.Name);
        System.out.println(e1.Empid);
        System.out.println(e1.JobRole);

        Employee e2 = new Employee();
        System.out.println(e2);

        System.out.println(e1.Name);
        System.out.println(e1.Empid);
        System.out.println(e1.JobRole);

    }
    
}
