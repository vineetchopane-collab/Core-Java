public class ObjectReference {

    static int x = 7;     // static variable 

    int y = 18;       // non static variable 

    public void test(){

        // System.out.println(x);
        // System.out.println(this.x);
        System.out.println(ObjectReference.x);
    }

    public static void main(String[] args){

        ObjectReference obj1 = new ObjectReference();
        ObjectReference obj2 = new ObjectReference();

        System.out.println(obj1.x);
        obj2.test();
    }
    
}
