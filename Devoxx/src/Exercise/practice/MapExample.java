package Exercise.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Employee> map = new HashMap<>();

        map.put("1", new Employee(4, "A", "2000", new Department(1, "HR")));
        map.put("4", new Employee(6, "C", "3000", new Department(5, "ADMIN")));
        map.put("2", new Employee(8, "D", "6000", new Department(6, "HR")));
        map.put("5", new Employee(9, "E", "7000", new Department(7, "DEV")));
        map.put("7", new Employee(3, "F", "8000", new Department(7, "DEV")));

        Map<String, Employee> sortedBySalary =
                map
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getEmployee_salary).reversed()))
                        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (a, b) -> a,
                                LinkedHashMap::new));

        System.out.println(sortedBySalary);
    }
}
