public class Student{

    String Name;
    int Sid;
    int Age;

    Student(){
        System.out.println("Student() Constructor");
    }

    public static void main(String[] args){

        Student s1 = new Student();
        System.out.println(s1);

        s1.Name = "Vineet";
        s1.Sid = 369;
        s1.Age = 21;

        System.out.println(s1.Name);
        System.out.println(s1.Sid);
        System.out.println(s1.Age);

        Student s2 = new Student();
        System.out.println(s2);

        s2.Name = "Vinu";
        s2.Sid = 34;
        s2.Age = 22;

        System.out.println(s2.Name);
        System.out.println(s2.Sid);
        System.out.println(s2.Age);

    }
}