class Details {

    // Non-static variables
    String name;
    int age;

    // Non-static method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Creating first object
        Details s1 = new Details();
        s1.name = "Vineet";
        s1.age = 21;

        // Creating second object
        Details s2 = new Details();
        s2.name = "Rahul";
        s2.age = 22;

        // Calling non-static method
        s1.display();
        s2.display();
    }
}