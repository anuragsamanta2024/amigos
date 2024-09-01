package java8.pratice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SumOfEachElement {

    public static void main(String[] args) {

        int[] numbers = {34, 56, 21, 47, 65};
        Integer sum = Arrays.stream(numbers).sum();
        List<Integer> list = convertArraysToList(numbers);
        List<Integer> numberList = getFlatMapResult(list);

        System.out.println(sum);
        System.out.println("-----------------------------------");
        System.out.println(numberList);

    }

    private static List<Integer> convertArraysToList(int[] numbers) {
        return Arrays.stream(numbers).boxed().toList();

    }

    private static List<Integer> getFlatMapResult(List<Integer> list) {
        List<List<Integer>> newList = List.of(list);
        List<Integer> flatMapList = newList.stream().flatMap(each -> each.stream()).toList();
        List<Integer> flatMapList1 = newList.stream().flatMap(Collection::stream).toList();
        return flatMapList;

    }
}
