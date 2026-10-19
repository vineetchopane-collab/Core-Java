package oops;
public class Emp {
	
	// Properties
	
	private String name;
	private int empid;
	private double salary;
	private String designation;
	
	// Behavior 
	
	public void working() {
		System.out.println(name + " is working as " + designation);
	}
	
	// Getter 
	
	public String getname() 
	{	
		return name;
	}
	
	public int getEmpid()
	{
		return empid;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public String getDesignation() 
	{
		return designation;
	}
	
	// Setter 
	
	public void SetName(String name)
	{
		this.name = name;
	}
	
	public void setsalary(double salary) 
	{
		this.salary = salary;
	}
	
	public void SetDesignation(String designation) 
	{
		this.designation = designation;
	}

	// Parameterized Constructor 
	
	Emp(String name, int empid, double salary, String designation)
	{
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.designation = designation;
	}
}
