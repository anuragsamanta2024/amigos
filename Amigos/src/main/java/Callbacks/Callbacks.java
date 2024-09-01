package Callbacks;

public class Callbacks {

    public static void main(String[] args) {

        hello("John", null, () -> System.out.println("LastName not provided"));

    }

    static void hello(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }

    }
}
