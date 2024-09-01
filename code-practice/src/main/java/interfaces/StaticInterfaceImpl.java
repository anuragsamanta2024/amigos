package interfaces;

public class StaticInterfaceImpl {

    public static void main(String[] args) {

        StaticInterfaceImpl staticInterfaceImpl = new StaticInterfaceImpl();
        StaticInterface.hello();
        hello();
    }

    public static void hello() {
        System.out.println("hello there");
    }

}
