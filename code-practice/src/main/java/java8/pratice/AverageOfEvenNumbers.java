package java8.pratice;

import java.util.Arrays;

public class AverageOfEvenNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Double avg = Arrays
                .stream(numbers)
                .filter(each -> each % 2 == 0)
                .average().orElse(0);

        System.out.println(avg);


    }
}
