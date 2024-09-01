package patterns.SingletonPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    void print() {
        System.out.println("This is a print message");
    }

    static void show() {
        System.out.println("To Show");
    }

}
