package interfaces.interface3.defaults;

interface Test1 {
    default void m2() {
        System.out.println("Test1 default implementation of m2");
    }
}

interface Test2 {
    default void m2() {
        System.out.println("Test2 default implementation of m2");

    }
}

public class Test implements Test1, Test2 {

    public static void main(String[] args) {

        new Test().m2();
    }

    @Override
    public void m2() {
        Test1.super.m2(); //use default method of interface
        System.out.println("inside m2 of Test");//provide own impl
    }
}

/*
Need to override one of the default methods if we are implementing multiple interfaces with
default method having same signature
*/
