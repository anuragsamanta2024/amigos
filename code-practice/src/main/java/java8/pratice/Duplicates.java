package java8.pratice;

import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.function.Function;

public class Duplicates {

    public static void main(String[] args) {

        String input = "aaaavvvvvvvbbbb";

        Map<String, Long> map = Arrays
                .stream(input.split(""))
                .collect(groupingBy(Function.identity(),LinkedHashMap::new, counting()));

        System.out.println(map);

        String duplicates = map
                .entrySet()
                .stream()
                .filter(each -> each.getValue() > 1)
                .map(each -> each.getKey())
                .collect(joining(", "));

        System.out.println(duplicates);

        Long duplicates1 = map
                .entrySet()
                .stream()
                .filter(each -> each.getValue() > 1)
                .map(each -> each.getValue())
                .sorted(Collections.reverseOrder())
                .findFirst().orElse(0L);

        System.out.println(duplicates1);

        System.out.println(duplicates1%2 == 0 ? "Even" : "Odd");

        System.out.println();
    }


}
