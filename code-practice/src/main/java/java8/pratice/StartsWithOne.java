package java8.pratice;

import java.util.Arrays;

public class StartsWithOne {

    public static void main(String[] args) {
        int[] numbers = {25, 9, 11, 2, 8, 15, 21, 3, 1};
        int[] elementStartsWithOne = Arrays
                .stream(numbers)
                .boxed()
                .filter(StartsWithOne::check)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(elementStartsWithOne));
    }

    private static boolean check(Integer num) {

        if (num >= 10) {
            while (num >= 10) {
                num = num / 10;
            }
            return num == 1;
        }
        return num == 1;
    }
}
