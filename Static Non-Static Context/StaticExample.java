public class StaticExample {

    static int x = 18;

    public static void test() {
        System.out.println(x);
    }

    public static void main(String[] args) {

        int x = 7;
        System.out.println(x);

        System.out.println(StaticExample.x);

        test();
    }

}
