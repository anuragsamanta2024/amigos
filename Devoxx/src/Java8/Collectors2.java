package Java8;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Collectors2 {

    public static void main(String[] args) {

         /*
        Collector(Function,Collector(Function,Collector))
         */

        partitioningByAge();
        groupByName();
        groupByNameAge();
        groupByNameCount();
        groupByNameAgeCountInteger();
    }

    private static void partitioningByAge() {

        Map<Boolean, List<Person>> partition = createPeople()
                .stream()
                .collect(partitioningBy(each -> each.getAge() % 2 == 0));

        System.out.println(partition);

        partition.forEach((key, value) -> {
            System.out.println(key ? "Even Age" : "Odd Age");
            System.out.println("-----------");
            System.out.println(value);
            System.out.println();
        });

    }

    private static void groupByName() {
        Map<String, List<Person>> groupByName = createPeople()
                .stream()
                .collect(groupingBy(Person::getName));
        System.out.println(groupByName);
    }

    private static void groupByNameAge() {

        Map<String, List<Integer>> groupNameByAge =
                createPeople()
                        .stream()
                        .collect(groupingBy(Person::getName,
                                mapping(Person::getAge, toList())));
        System.out.println(groupNameByAge);


    }

    private static void groupByNameCount() {

        Map<String, Long> groupByNameAgeCount = createPeople()
                .stream()
                .collect(groupingBy(Person::getName, counting()));

        System.out.println(groupByNameAgeCount);

    }

    private static void groupByNameAgeCountInteger() {
        Map<String, Integer> groupByNameAgeCountInteger = createPeople()
                .stream()
                .collect(groupingBy(Person::getName,
                        collectingAndThen(counting(), Long::intValue)));

        System.out.println(groupByNameAgeCountInteger);
    }

    public static List<Person> createPeople() {
        return List.of(
                new Person("Sara", 20),
                new Person("Sara", 20),
                new Person("Sara", 22),
                new Person("Bob", 20),
                new Person("Paula", 32),
                new Person("Paul", 32),
                new Person("Jack", 3),
                new Person("Bill", 72),
                new Person("Jill", 11)
        );
    }
}


/*

Collectors perform local mutability
 */
