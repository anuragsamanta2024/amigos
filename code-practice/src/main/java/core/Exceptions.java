package core;

public class Exceptions {

    public static void main(String[] args) {
        Exceptions obj = new Exceptions();
        obj.myMethod();
        System.out.println("Normal Flow");
    }

    private void myMethod() {

        try {
            myMethod2();
        } catch (Exception exception) {
            System.out.println("Exception occurred " + exception);
        }
    }

    private void myMethod2() {
        myMethod3();

    }

    private void myMethod3() {
    }

}
