package stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ReduceStreamingApp {

    public static void main(String[] args) {
        aggregate();
    }


    private static void aggregate() {
        int[] numbers = {1, 6, 8, 2, 7};
        int sum = Arrays.stream(numbers).sum();
        OptionalInt max = Arrays.stream(numbers).max();
        OptionalInt min = Arrays.stream(numbers).min();
        OptionalDouble avg = Arrays.stream(numbers).average();
        long count = Arrays.stream(numbers).count();
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
        System.out.println("Count: " + count);
    }
}
