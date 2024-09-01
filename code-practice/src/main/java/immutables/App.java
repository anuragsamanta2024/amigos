package immutables;

public class App {
    public static void main(String[] args) {

        Student student1 = new Student(1, "John", new Address("Blr", "Odisha"));
        System.out.println(student1);

        Address address1 = student1.getAddress();
        address1.setCity("pune");
        address1.setState("MH");
        System.out.println(student1);


    }
}
