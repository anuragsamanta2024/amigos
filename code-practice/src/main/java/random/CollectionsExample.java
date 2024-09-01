package random;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {

        List<String> elements = Arrays.asList("Apples", "Oranges", "Grapes", "Oranges");
        toHashSet(elements);
        useDistinct(elements);
        toAnotherList(elements);

    }

    static void toHashSet(List<String> elements) {
        Set<String> set = new HashSet<>(elements);
        System.out.println("Set :" + set);

    }

    static void useDistinct(List<String> elements) {
        List<String> list = elements.stream().distinct().toList();
        System.out.println("New List :"+ list);

    }

    static void toAnotherList(List<String> elements) {
        List<String> newList = new ArrayList<>();
        elements.forEach(each -> {
            if (!newList.contains(each)) {
                newList.add(each);
            }
        });
        System.out.println("New List :" + newList);

    }
}
