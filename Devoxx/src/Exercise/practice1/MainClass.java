package Exercise.practice1;

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
        findHighestSalaryFromDevDept(emp_list);
        findEmployeeWithHighestSalaryFromDevDept(emp_list);
        findHighestSalaryFromDevDeptIfBothSame(emp_list);
    }

    private static void findHighestSalaryFromDevDept(List<Employee> emp_list) {
        String salary = emp_list
                .stream()
                .filter(each -> Objects.equals(each.getDept().getDept_name(), "DEV"))
                .map(Employee::getEmployee_salary)
                .sorted(Collections.reverseOrder())
                .findFirst().orElse("NA");

        System.out.println("findHighestSalaryFromDevDept " + salary);
    }

    private static void findEmployeeWithHighestSalaryFromDevDept(List<Employee> emp_list) {
        Map<String, Optional<Employee>> highestInDev =
                emp_list
                        .stream()
                        .filter(each -> each.getDept().getDept_name() == "DEV")
                        .collect(groupingBy(each -> each.getDept().getDept_name(),
                                reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getEmployee_salary)))));
        System.out.println("findEmployeeWithHighestSalaryFromDevDept " + highestInDev);

    }

    private static void findHighestSalaryFromDevDeptIfBothSame(List<Employee> emp_List) {
        List<String> result = emp_List
                .stream()
                .filter(each -> Objects.equals(each.getDept().getDept_name(), "DEV"))
                .map(Employee::getEmployee_salary)
                .distinct()
                .toList();
        System.out.println(result);

        //  boolean isSalaryEqual = result.stream().allMatch(each -> each.equals(result.get(0)));
        if (result.size() > 1) {
            String highestInDev = result
                    .stream()
                    .sorted(Collections.reverseOrder())
                    .findFirst().orElse("NA");

            System.out.println("findEmployeeWithHighestSalaryFromDevDept " + highestInDev);
        } else {
            System.out.println("findEmployeeWithHighestSalaryFromDevDept " + result.get(0));
        }
    }
}
