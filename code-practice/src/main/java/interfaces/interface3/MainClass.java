package interfaces.interface3;

public class MainClass {
    public static void main(String[] args) {

        Employee employee = new EmployeeImpl();
        System.out.println(employee.name());
        System.out.println(employee.designation());

    }
}
