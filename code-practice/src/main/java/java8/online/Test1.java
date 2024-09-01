package java8.online;

import java.util.Arrays;
import java.util.Collections;

public class Test1 {

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 22, 11, 33, 5};

        int max = Arrays.stream(a).max().orElse(0);
        System.out.println(max);

        int min = Arrays.stream(a).min().orElse(0);
        System.out.println(min);

        int max2 = Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).findFirst().orElse(0);
        System.out.println(max2);

        int min2 = Arrays.stream(a).sorted().findFirst().orElse(0);
        System.out.println(min2);
    }
}
