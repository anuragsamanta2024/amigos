package java8.online;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge {

    public static void main(String[] args) {

        int[] a = {5, 7, 3, 4, 6, 9};
        int[] b = {2, 9, 2, 2, 1, 5};

        int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .distinct()
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(result));
    }
}
