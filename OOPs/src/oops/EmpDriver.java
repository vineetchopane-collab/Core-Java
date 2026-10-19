package oops;
public class EmpDriver {
	
	public static void main(String[] args) {
		
		Emp e1 = new Emp("Vineet",34,83934,"Java Trainer");
		displayEmp(e1);
		
		// Changing Designation 
		
		e1.SetDesignation("Senior Java Trainer");
		
		// Changing Salary 
		
		e1.setsalary(65000);
		
		displayEmp(e1);
		
		Emp e2 = new Emp("Janhavi",18,8967,"CA");
		displayEmp(e2);
		
}
	
	// Utility Method 
	public static void displayEmp(Emp e)
	{
		System.out.println("================Employee Details=======================");
		System.out.println("name: " + e.getname());
		System.out.println("empid: " + e.getEmpid());
		System.out.println("salary: " + e.getSalary());
		System.out.println("designation: " + e.getDesignation());
		e.working();
		System.out.println("==================================");
		System.out.println();
	}

}
