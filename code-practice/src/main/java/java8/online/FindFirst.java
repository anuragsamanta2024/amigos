package java8.online;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class FindFirst {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        int value = myList.stream().findFirst().orElse(0);
        System.out.println(value);

        int[] arr = {1, 2, 3, 1};
        boolean result = containsDuplicate(arr);
        System.out.println(result);

        List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
        List<Integer> newList = integerList
                .stream()
                .map(each -> (int) Math.pow(each, 3))
                .toList();
        System.out.println(newList);

    }

    private static boolean containsDuplicate(int[] arr) {

        Map<Integer, Long> map = Arrays
                .stream(arr)
                .boxed()
                .collect(groupingBy(Function.identity(), counting()));

        boolean result = map
                .entrySet()
                .stream()
                .allMatch(each -> each.getValue() == 1);
        System.out.println(result ? "No duplicates" : "Duplicates");


        List<Integer> list1 = Arrays.stream(arr).boxed().toList();
        List<Integer> list2 = Arrays.stream(arr).boxed().distinct().toList();
        if (list1.size() == list2.size()) {
            return false;
        } else {
            return true;
        }
    }
}
