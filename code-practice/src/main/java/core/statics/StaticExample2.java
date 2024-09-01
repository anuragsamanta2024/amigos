package core.statics;

public class StaticExample2 {
    static int a = 100;
    int b = 120;

    static int c;

    static {
        System.out.println("Inside Static Block");
        c = 20;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
