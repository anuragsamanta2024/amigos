package java8.pratice;

import java.util.Arrays;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 8, 7};

        Integer min = Arrays
                .stream(numbers)
                .sorted()
                .findFirst()
                .orElse(0);
        System.out.println(min);

        Integer minNumber = Arrays
                .stream(numbers)
                .min().orElse(0);
        System.out.println(minNumber);

    }
}
