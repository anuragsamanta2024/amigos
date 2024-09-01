package java8.online;

import java.util.*;

import static java.util.stream.Collectors.*;

public class SeparateEvenAndOdd {

    public static void main(String[] args) {

        int[] numbers = {21, 5, 43, 78, 43, 81, 22, 79};
        Map<Boolean, List<Integer>> map =
                Arrays.stream(numbers)
                        .boxed()
                        .collect(partitioningBy(each -> each % 2 == 0));

        map.forEach((key, value) -> {
            System.out.println(key ? "Even" : "Odd");
            System.out.println("------------");
            System.out.println(value);
            System.out.println();
        });
    }
}

