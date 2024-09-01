package java8.pratice;

import java.util.*;
import java.util.function.BinaryOperator;

import static java.util.stream.Collectors.*;

public class HighestInEachDept {

    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("1", "John", "QA", "5000"),
                new Employee("4", "Jim", "HR", "7000"),
                new Employee("6", "Mike", "DEV", "3000"),
                new Employee("2", "Bob", "HR", "2000"),
                new Employee("3", "Betty", "DEV", "3000")
        );

        Map<String, Optional<Employee>> employeeMap = employees
                .stream()
                .collect(groupingBy(Employee::getDept,
                        reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

        System.out.println(employeeMap);

        Map<String, Set<String>> map =
                employees
                        .stream()
                        .collect(groupingBy(Employee::getDept,
                                mapping(Employee::getSalary, toSet())));
        System.out.println(map);
    }

    static class Employee {

        String id;
        String name;
        String dept;
        String salary;

        @Override
        public String toString() {
            return "Employee{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", dept='" + dept + '\'' +
                    ", salary='" + salary + '\'' +
                    '}';
        }

        Employee(String id, String name, String dept, String salary) {
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }

        public String getDept() {
            return dept;
        }

        public String getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}


