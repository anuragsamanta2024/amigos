package Exercise.practice2;

import Exercise.practice.*;

import java.util.*;
import java.util.function.BinaryOperator;

import static java.util.stream.Collectors.*;

public class MainClass {

    public static void main(String[] args) {
        List<Employee> emp_list = Arrays.asList(new Employee(4, "A", "2000", new Department(1, "HR")),
                new Employee(6, "C", "3000", new Department(5, "ADMIN")),
                new Employee(8, "D", "6000", new Department(6, "HR")),
                new Employee(9, "A", "7000", new Department(7, "DEV")),
                new Employee(3, "F", "7000", new Department(7, "DEV")));
        findSalaryAndSortByName(emp_list);
        findEmployeeCountInEachDept(emp_list);
        findFrequencyOfEachName(emp_list);
    }
  private static void findSalaryAndSortByName(List<Employee> emp_list) {
        System.out.println("findSalaryAndSortByName");
        emp_list
                .stream()
                .filter(each -> each.getEmployee_salary() == "7000")
                .sorted(Comparator.comparing(Employee::getEmployee_name).reversed())
                .forEach(System.out::println);
    }

    private static void findEmployeeCountInEachDept(List<Employee> emp_list) {

        Map<String, Long> employeeCountInEachDepartment =
                emp_list.stream()
                        .collect(groupingBy(each -> each.getDept().getDept_name(), counting()));
        System.out.println("findEmployeeCountInEachDept "+employeeCountInEachDepartment);
    }

    private static void findFrequencyOfEachName(List<Employee> emp_list) {

        Map<String, Long> frequencyOfEachName =
                emp_list.stream()
                        .collect(groupingBy(Employee::getEmployee_name, counting()));
        System.out.println("findFrequencyOfEachName "+frequencyOfEachName);

    }


}
