package java8.online;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] a = {4, 7, 6, 4, 9, 3, 5, 9};
        removeDuplicates(a);
        System.out.println();
        findDuplicates(a);
        System.out.println();
    }

    private static void removeDuplicates(int[] a) {

        int[] uniqueElements = Arrays
                .stream(a)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(uniqueElements));
    }

    private static void findDuplicates(int[] a) {
        Map<Integer, Long> map = Arrays
                .stream(a)
                .boxed()
                .collect(groupingBy(Function.identity(), counting()));

        int[] dups = map
                .entrySet()
                .stream()
                .filter(each -> each.getValue() > 1)
                .map(each -> each.getKey())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(dups));
    }
}
