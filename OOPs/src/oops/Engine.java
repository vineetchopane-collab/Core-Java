package oops;
public class Engine {
	
	// Properties 
	
	private int cc;
	
	// Getter 
	public int getCc() {
		return cc;
	}
	
	// Parameterized constructor 
	Engine(int cc){
		
		this.cc = cc;
		System.out.println("Engine Object Loaded");
	}

}
