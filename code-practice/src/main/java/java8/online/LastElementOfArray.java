package java8.online;

import java.util.Arrays;

public class LastElementOfArray {
    public static void main(String[] args) {

        int[] a = {4, 7, 6, 4, 9, 3, 5, 9};
        int number = Arrays
                .stream(a)
                .skip(a.length - 1)
                .findFirst().orElse(0);
        System.out.println(number);

    }

}
