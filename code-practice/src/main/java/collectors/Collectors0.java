package collectors;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class Collectors0 {

    public static void main(String[] args) {

       
        /*
        Fetch names from list and convert to linkedHashSet
         */

        fetchNamesFromListAndConvertToLinkedHashSet();
        fetchNamesFromListAndConvertToLinkedHashSet3();
        List<String> names = createPeople()
                .stream()
                .map(Person::getName)
                .toList();

        Set<String> stringSet = Optional.ofNullable(names)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .collect(toCollection(LinkedHashSet::new));
        System.out.println("Names :" + stringSet);

    }

    private static void fetchNamesFromListAndConvertToLinkedHashSet() {

        Set<String> name = createPeople()
                .stream()
                .map(Person::getName)
                .collect(toCollection(LinkedHashSet::new));
        System.out.println(name);
    }

    private static void fetchNamesFromListAndConvertToLinkedHashSet1() {
        Map<String, Integer> map = createPeople()
                .stream()
                .collect(toMap(Person::getName, Person::getAge,
                        (a, b) -> a,
                        LinkedHashMap::new));
    }

    private static void fetchNamesFromListAndConvertToLinkedHashSet3() {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> count = names
                .stream()
                .collect(groupingBy(Function.identity(), counting()));

        System.out.println(count);

        List<String> list = count
                .entrySet()
                .stream()
                .filter(each -> each.getValue() > 1)
                .map(each -> each.getKey())
                .toList();

        System.out.println(list);


    }

    public static List<Person> createPeople() {
        return List.of(
                new Person("Sara", 20),
                new Person("Sara1", 20),
                new Person("Sara2", 22),
                new Person("Bob", 20),
                new Person("Paula", 32),
                new Person("Paul", 32),
                new Person("Jack", 3),
                new Person("Bill", 72),
                new Person("Jill", 11)
        );
    }

}
