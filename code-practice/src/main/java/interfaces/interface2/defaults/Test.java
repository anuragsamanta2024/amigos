package interfaces.interface2.defaults;

interface Test1 {
    default void m2() {
        System.out.println("default implementation of m2");
    }
}

public class Test implements Test1 {

    public static void hello() {
        //Accessing default method from static method
        Test test = new Test();
        test.m2();

    }

    public static void main(String[] args) {
        hello();
    }
}
