package Exercise;

public class Base {

    public Base() {
        System.out.println("Base called");
        check();
    }

    public void check() {
        System.out.println("test");
    }
}

class Derived extends Base {
    private final String value;

    public Derived(String value) {
        System.out.println("Derived called");
        this.value = value;
    }

    public void check() {
        System.out.println("Check called");
        if (value.length() == 0) {
            throw new RuntimeException("value given is empty");
        }
    }

}
class Sample1 {
    public static void main(String[] args) {
        try {
            new Derived("");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}






