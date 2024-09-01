package oops.Encapsulation;

public class MainClass {
    public static void main(String[] args) {
        EncapsulationExample encapsulationExample = new EncapsulationExample("John", 23);
        System.out.println(encapsulationExample.getName());
        encapsulationExample.setName("Anurag");
        System.out.println(encapsulationExample.getName());
        ;

    }
}
