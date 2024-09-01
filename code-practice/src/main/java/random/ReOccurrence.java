package random;

import java.util.*;
import java.util.function.Function;


import static java.util.stream.Collectors.*;

public class ReOccurrence {
    public static void main(String[] args) {
        String s = "BCADA";
        Map<String, Long> map = Arrays.stream(s.split(""))
                .collect(groupingBy(Function.identity(), counting()));

        String occur = map
                .entrySet()
                .stream()
                .filter(each -> each.getValue() > 1)
                .map(each -> each.getKey())
                .collect(joining());
        System.out.println(occur);
    }
}
