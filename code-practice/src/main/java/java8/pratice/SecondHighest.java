package java8.pratice;

import java.util.Arrays;
import java.util.Collections;

public class SecondHighest {

    public static void main(String[] args) {

        int[] numbers = {5, 6, 23, 11, 21, 23, 10, 25};
        Integer list1 = findSecondHighest(numbers);
        System.out.println(list1);

    }

    private static Integer findSecondHighest(int[] numbers) {

        return Arrays
                .stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst().orElse(0);
    }


}
