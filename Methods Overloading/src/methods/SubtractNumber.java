package methods;
public class SubtractNumber{
	
	public static int min(int a, int b) {
		
		return (a<b)? a:b;
	}
	
	public static double min(double a, double b) {
		
		return(a<b) ? a:b; 
	}
	
	public static void main(String[] args) {
		
		System.out.println(min(12,34));
		System.out.println(min(77.24,63.23));
	}
}

