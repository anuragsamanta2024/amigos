package random;

public class Child extends Parent {
    public static void m1() {
        System.out.println("Child Class static method");
    }

    public void m2() {
        System.out.println("Child class abstract method");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.m1();
        Parent.m1();
        parent.m2();
        m1();

        Parent parent1 = new Parent();
        parent1.m1();
        parent1.m2();

    }
}
