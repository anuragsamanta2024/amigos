package java8.pratice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class CountCharacters {

    public static void main(String[] args) {
        String input = "Samanta";

        Map<String, Integer> map = mapCount(input);
        System.out.println(map);

        System.out.println("---------------------------------");

        Map<String, Long> countMap = groupByCount(input);
        System.out.println(countMap);

    }


    static Map<String, Integer> mapCount(String input) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }

    private static Map<String, Long> groupByCount(String input) {
        return Arrays
                .stream(input.split(""))
                .collect(groupingBy(Function.identity(), counting()));
    }
}



