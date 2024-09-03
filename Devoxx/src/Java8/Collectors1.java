package Java8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.*;

public class Collectors1 {

    public static void main(String[] args) {
        getData();
        printNamesOlderThan30();
        commaSeparatedNamesOfPeopleOlderThan30();
        createMap();
        createMapWithNonDuplicateKeys();
        getAgesAndMakeItImmutable();

    }

    private static void getData() {
        // createPeople().forEach(System.out::println);
    }

    private static void printNamesOlderThan30() {

        List<String> namesOlderThan30 = createPeople()
                .stream()
                .filter(each -> each.getAge() > 30)
                .map(Person::getName)
                .toList();
        System.out.println("NamesOlderThan30: " + namesOlderThan30);
    }

    private static void commaSeparatedNamesOfPeopleOlderThan30() {
        String namesOlderThan30CommaSeparated = createPeople()
                .stream()
                .filter(each -> each.getAge() > 30)
                .map(Person::getName)
                .collect(joining(", "));

        System.out.println("NamesOlderThan30CommaSeparated: " + namesOlderThan30CommaSeparated);
    }

    private static void createMap() {

        // Map<String, Integer> map = new HashMap<>();
        // Shared Mutability
        // createPeople().forEach(each -> map.put(each.getName(), each.getAge()));

//        Map<String, Integer> map = createPeople()
//                .stream()
//                .collect(toMap(Person::getName, Person::getAge));
//
//        System.out.println("Map with duplicates:" + map);
    }

    private static void createMapWithNonDuplicateKeys() {
        Map<String, Integer> map = createPeople()
                .stream()
                .collect(toMap(Person::getName, Person::getAge,
                        (a, b) -> a,
                        LinkedHashMap::new));
        System.out.println("Map without duplicates:" + map);
        //LinkedHashMap maintains insertion order
    }

    private static void getAgesAndMakeItImmutable() {

        List<Integer> ages = createPeople()
                .stream()
                .map(Person::getAge)
                .toList();

        // ages.add(99); // UnsupportedOperationException

        System.out.println("Ages" + ages);

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
                new Person("Jack", 11)
        );
    }
}
