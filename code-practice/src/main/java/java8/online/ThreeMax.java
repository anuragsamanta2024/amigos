package java8.online;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeMax {

    public static void main(String[] args) {

        int[] a = {2, 55, 43, 66, 88, 32, 123, 76};
        Integer[] arr = Arrays
                .stream(a)
                .boxed()
                .distinct()
                .sorted(Collections.reverseOrder())
                .limit(3)
                .toArray(Integer[]::new);

        int[] array = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(arr[i] + " ");
        }


        List<Integer> list = List.of(1, 2, 3);
        list.toArray(Integer[]::new);


    }


}
