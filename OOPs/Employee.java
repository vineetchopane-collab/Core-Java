public class Employee{
    
    // Non-static Variable
    String Name;
    int EmpId;
    double Salary;
    String Designation;

    // Non-static Method
    public void working(){

        System.out.println(Name + " is working" + Designation);
    }

    // Paramaterized Constructor 
    Employee(String Name, int EmpId, double Salary, String Designation){

        this.Name = Name;
        this.EmpId = EmpId;
        this.Salary = Salary;
        this.Designation = Designation;

    }

    public static void main(String[] args){

        Employee e1 = new Employee("Vineet", 1, 65000, "Pune");

        System.out.println(e1.Salary);

        Employee e2 = new Employee("Chopane", 2, 55000, "Banglore");

        System.out.println(e2.Designation);
    }
}