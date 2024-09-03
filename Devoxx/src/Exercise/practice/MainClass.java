package Exercise.practice;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class MainClass {
    public static void main(String[] args) {

        List<Employee> emp_list = Arrays.asList(new Employee(4, "A", "2000", new Department(1, "HR")),
                new Employee(6, "C", "3000", new Department(5, "ADMIN")),
                new Employee(8, "D", "6000", new Department(6, "HR")),
                new Employee(9, "E", "7000", new Department(7, "DEV")),
                new Employee(3, "F", "8000", new Department(7, "DEV")));

        groupByDeptId(emp_list);
        findEmpNameGroupByDeptId(emp_list);
        findEmpNameGroupByDeptIdSSemicolonSeparated(emp_list);
        mergeAndSortTwoLists();
        sortBasedOnSalaryDescending(emp_list);
        sortBasedOnSalaryDescendingAndEmployeeNameAscending(emp_list);
    }

    private static void groupByDeptId(List<Employee> emp_list) {
        Map<Integer, List<Employee>> groupByDeptId =
                emp_list
                        .stream()
                        .collect(groupingBy(each -> each.getDept().getDept_id()));

        System.out.println(groupByDeptId);

    }

    private static void findEmpNameGroupByDeptId(List<Employee> emp_list) {

        Map<Integer, List<String>> findEmployeeNameGroupByDeptId =
                emp_list
                        .stream()
                        .collect(groupingBy(each -> each.getDept().getDept_id(),
                                mapping(Employee::getEmployee_name, toList())));

        System.out.println(findEmployeeNameGroupByDeptId);
    }

    private static void findEmpNameGroupByDeptIdSSemicolonSeparated(List<Employee> emp_list) {

        Map<Integer, String> findEmpNameGroupByDeptId =
                emp_list
                        .stream()
                        .collect(groupingBy(each -> each.getDept().getDept_id(),
                                mapping(Employee::getEmployee_name, joining(";"))));
        System.out.println(findEmpNameGroupByDeptId);
    }

    public static void mergeAndSortTwoLists() {
        List<Students> students1 = List.of(
                new Students(1, "A", "A@gmail.com"),
                new Students(5, "C", "C@gmail.com"),
                new Students(9, "E", "E@gmail.com"),
                new Students(7, "F", "F@gmail.com"));

        System.out.println(students1);

        List<Students> students2 = List.of(new Students(8, "I", "I@gmail.com"),
                new Students(2, "G", "G@gmail.com"),
                new Students(4, "H", "H@gmail.com"),
                new Students(3, "J", "J@gmail.com"));

        System.out.println(students2);

        List<Students> mergedList = Stream.of(students1, students2)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparing(Students::getId))
                .toList();

        System.out.println(mergedList);
    }

    private static void sortBasedOnSalaryDescending(List<Employee> emp_list) {
        List<Employee> sortedBasedOnSalary =
                emp_list
                        .stream()
                        .sorted(Comparator.comparing(Employee::getEmployee_salary)
                                .reversed())
                        .toList();

        System.out.println(sortedBasedOnSalary);
    }


    private static void sortBasedOnSalaryDescendingAndEmployeeNameAscending(List<Employee> empList) {

        List<Employee> list = empList
                .stream()
                .filter(each -> each.getDept().getDept_name().equals("DEV"))
                .sorted(Comparator.comparing(Employee::getEmployee_salary)
                        .reversed()
                        .thenComparing(Employee::getEmployee_name))
                .toList();

        System.out.println("Sort " + list);
    }


}
