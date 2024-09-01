package java8.pratice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FirstNonRepeat {

    public static void main(String[] args) {
        String input = "capgemingi";

        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(groupingBy(Function.identity(),LinkedHashMap::new ,counting()));
        System.out.println(map);

        String value = map
                .entrySet()
                .stream()
                .filter(each -> each.getValue() == 1)
                .map(each -> each.getKey())
                .findFirst().orElse("NA");
        System.out.println(value);

        String value1 = map
                .entrySet()
                .stream()
                .filter(each -> each.getValue() > 1)
                .map(each -> each.getKey())
                .findFirst().orElse("NA");
        System.out.println(value1);
    }
}


