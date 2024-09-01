package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {

        consumer1.accept(Arrays.asList(
                new Employee("1", "John"), new Employee("2", "Lenny")));


        Consumer<List<Employee>> listConsumer = consumer1.andThen(consumer2);
        listConsumer.accept((Arrays.asList(
                new Employee("1", "John"), new Employee("2", "Lenny"))));

    }

    static Consumer<List<Employee>> consumer1 = employee ->
            employee.forEach(each -> System.out.println("{" + each.getName() + "," + each.getId() + "}"));

    static Consumer<List<Employee>> consumer2 = employee ->
            employee.forEach(each -> System.out.println(each.getId()));
}

class Employee {

    String id;
    String name;

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }


    public String getId() {
        return id;
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
