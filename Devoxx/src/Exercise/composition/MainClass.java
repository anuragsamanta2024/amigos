package Exercise.composition;


import Exercise.aggregation.Address;

public class MainClass {
    public static void main(String[] args) {
        Address address = new Address("Pune","MH");
        Employee employee = new Employee(1L, "John", "Pune", "MH");
        System.out.println(employee);

    }

}
