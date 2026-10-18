package methods;
public class addition{
	
	public static int add(int a, int b) {
		
		System.out.println("add(int, int)");
		
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		
		System.out.println("add(int,int,int)");{
			
			return a+b+c;
		}
	}
	
	public static double add(double a, double b) {
		
		System.out.println("add(double,double)");
		return a+b;
	}
	
	public static double add(double a, double b, double c) {
		
		System.out.println("add(double,double,double)");{
			return a+b+c;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(add('A','B'));
		System.out.println(add(1,1,2));
	}
}