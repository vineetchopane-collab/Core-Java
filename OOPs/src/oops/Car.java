package oops;

public class Car {

    // Non-static variable
    String Modelzname;

    private Engine engine;

    // Constructor
    public Car(String Modelzname, int cc) {

        // Early instantiation
        engine = new Engine(cc);

        this.Modelzname = Modelzname;

        System.out.println("Car Object created and loaded");
    }

    public Engine getEngine() {
        return engine;
    }
}