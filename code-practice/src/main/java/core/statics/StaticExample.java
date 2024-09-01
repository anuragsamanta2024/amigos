package core.statics;

public class StaticExample {

    static int a = 1;

    static void hello() {
        System.out.println("hello");
    }

    void print() {
        a = 2;
        System.out.println(a);
        System.out.println("Print");
    }

}
