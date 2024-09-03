package Exercise.aggregation;

public class MainClass {

    public static void main(String[] args) {

        Address address = new Address("Pune","MH");
        Employee employee = new Employee(1L,"John",address);
        System.out.println(employee);

    }
}
