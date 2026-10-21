package oops;
public class CarDriver {
	
	public static void main(String[] args) {
		Car car = new Car("Tata",1200);
		
		System.out.println(car);
		
		// Showing engine exist inside car
		System.out.println(car.getEngine());
		
		// showing CC of engine 
		System.out.println(car.getEngine().getCc());
	}

}
