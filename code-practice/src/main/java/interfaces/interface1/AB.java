package interfaces.interface1;

public class AB implements A,B{
    public static void main(String[] args) {
        AB ab = new AB();
        ab.sayHello();
        A a = new AB();
        a.sayHello();
    }


    @Override
    public void sayHello() {
        //Calling default method from another method
        B.super.sayHello();
        //System.out.println("Hello");
    }
}

interface A {
    default void sayHello() {
        System.out.println("Hello from A");
    }
}

interface B {

    default void sayHello() {
        System.out.println("Hello from B");
    }
}

