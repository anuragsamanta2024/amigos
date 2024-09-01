package random;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class Duplicates {
    public static void main(String args[]) {
        findEachElementCount();
    }

    private static void findEachElementCount() {
        List<Integer> list = List.of(1, 3, 5, 4, 3, 6, 5, 4);
        Map<Integer, Long> map = list
                .stream()
                .collect(groupingBy(Function.identity(), counting()));
        map.forEach((key, value) -> {
            System.out.println("Count of " + key + " is " + value);

        });

    }
}
