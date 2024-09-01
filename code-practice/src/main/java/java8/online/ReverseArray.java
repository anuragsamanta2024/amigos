package java8.online;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a = {4, 7, 6, 1, 9, 3};
        int[] reversedArray = IntStream.rangeClosed(1, a.length)
                .map(each-> a[a.length-each])
                .toArray();
        System.out.println(Arrays.toString(reversedArray));
    }


}
