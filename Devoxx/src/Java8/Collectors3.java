package Java8;

import java.util.*;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;

public class Collectors3 {
    public static void main(String[] args) {
        sumOfAges();
        maxAge();
        maxAgePerson();
        maxAgeName();
        filteringByName();

    }

    private static void sumOfAges() {

        Integer sumOfAges = createPeople()
                .stream()
                .mapToInt(Person::getAge)
                .sum();

        System.out.println(sumOfAges);
    }

    private static void maxAge() {
        OptionalInt maxAge = createPeople()
                .stream()
                .mapToInt(Person::getAge)
                .max();
        System.out.println(maxAge);

    }

    private static void maxAgePerson() {
        Optional<Person> person = createPeople()
                .stream()
                .max(Comparator.comparing(Person::getAge));
        System.out.println(person);

    }


    private static void maxAgeName() {
        String maxAgeName =
                createPeople()
                        .stream()
                        .collect(collectingAndThen(
                                maxBy(Comparator.comparing(Person::getAge)),
                                person -> person.map(each -> each.getName()).orElse("")));
        System.out.println("Max Age name:" + maxAgeName);
    }

    //Filtering
    private static void filteringByName() {
        Map<Integer, List<String>> filterByNameGreaterThan4
                = createPeople()
                .stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getName,
                                filtering(name -> name.length() > 4, toList()))));

        System.out.println("FilterByNameGreaterThan4" + filterByNameGreaterThan4);
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
