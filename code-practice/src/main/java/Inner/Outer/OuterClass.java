package Inner.Outer;

public class OuterClass {

    String name1 = "John";
    static String name2 = "Larry";

    public class InnerClass1 {

        void print() {
            System.out.println("Name1: " + name1);
            System.out.println("Name2: " + name2);
        }
    }

    public static class InnerClass2 {

        void print() {
            //    System.out.println("Name1: " + name1);Static class cannot access non-static member of outer class
            System.out.println("Name2: " + name2);
        }
    }

    public static void main(String[] args) {


        OuterClass.InnerClass1 innerClass1 = new OuterClass().new InnerClass1();
        innerClass1.print();

        InnerClass2 innerClass2 = new InnerClass2();
        innerClass2.print();// Static Class does not need reference of outer class

    }
}
