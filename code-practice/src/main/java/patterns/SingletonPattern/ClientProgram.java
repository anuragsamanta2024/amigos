package patterns.SingletonPattern;

public class ClientProgram {

    public static void main(String[] args) {
        Singleton.getInstance().print();
        Singleton.show();
    }
}
