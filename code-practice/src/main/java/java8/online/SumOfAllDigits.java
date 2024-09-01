package java8.online;

import static java.util.stream.Collectors.*;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class SumOfAllDigits {
    public static void main(String[] args) {

        int number = 645;
        int sum = Stream.of(String.valueOf(number)
                        .split(""))
                .mapToInt(Integer::parseInt)
                .sum();

        IntSummaryStatistics intSummaryStatistics =
                Stream.of(String.valueOf(number).split(""))
                        .collect(summarizingInt(Integer::parseInt));

        long sum1 = intSummaryStatistics.getSum();
        System.out.println(sum);

    }
}
