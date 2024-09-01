package java8.online;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxInList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 6, 8, 34, 56, 21, 77, 66);
        Integer max = list
                .stream()
                .mapToInt(each -> each)
                .max().orElse(0);

        System.out.println(max);

        Integer max1 = list
                .stream()
                .sorted(Collections.reverseOrder())
                .findFirst().orElse(0);
        System.out.println(max1);


    }
}
