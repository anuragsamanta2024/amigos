package java8.pratice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class MajorityArray {

    public static void main(String[] args) {

        int[] majorityArray = {5, 3, 2, 1, 2, 4, 3, 2, 2, 6, 2, 3, 2, 2, 2};
        ifMajority(majorityArray);
        sortInAscending();
        sortInDescending();
    }

    private static void ifMajority(int[] majorityArray) {
        Map<Integer, Long> map = Arrays
                .stream(majorityArray)
                .boxed()
                .collect(groupingBy(Function.identity(), counting()));
        int[] values = map
                .entrySet()
                .stream()
                .filter(each -> each.getValue() > majorityArray.length / 2)
                .map(each -> each.getKey())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(values));
    }

    private static void sortInAscending() {
        int[] a = {1, 2, 3};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sortInDescending() {
        int[] a = {1, 2, 3};
        int[] sorted = Arrays
                .stream(a)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(sorted));
    }
}
