package interfaces.interface4;

//Default priority
interface Test1 {

    default void m2() {
        System.out.println("default method of Test1");
    }
}

class Test2 {
    public void m2() {
        System.out.println("Method of Test2");
    }
}

public class Test extends Test2 implements Test1 {

    public static void main(String[] args) {
        new Test().m2();

    }
}
