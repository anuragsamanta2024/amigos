package java8.online;

import java.util.Arrays;
import java.util.List;

public class CommonElements {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 6, 32, 11, 35);
        List<Integer> list2 = Arrays.asList(8, 2, 3, 45, 32, 45);
        List<Integer> commonList = list1
                .stream()
                .filter(list2::contains)
                .toList();
        System.out.println(commonList);

    }
}
