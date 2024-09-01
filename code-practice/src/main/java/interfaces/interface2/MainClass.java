package interfaces.interface2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Parent parent = System.out::println;
        parent.print("I am parent");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list);

        list.sort(new ComparatorClass());
        System.out.println(list);

        Comparator<Integer> comparator = (a, b) -> b - a;
        list.sort(comparator);
        System.out.println(list);

        System.out.println(list.stream().sorted(Collections.reverseOrder()).toList());
    }
}


class ComparatorClass implements Comparator<Integer> {
    @Override
    public int compare(Integer o2, Integer o1) {
        return o2 - o1;
    }
}
