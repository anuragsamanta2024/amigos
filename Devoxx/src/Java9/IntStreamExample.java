package Java9;

import java.util.stream.IntStream;

public class IntStreamExample {

    public static void main(String[] args) {
        IntStream.iterate(0, i -> i <= 10, i-> i + 3)
                .forEach(System.out::println);

        System.out.println("-----------------------");

        IntStream.iterate(0, i -> i + 3)
                .takeWhile(i -> i <= 10)
                .forEach(System.out::println);

    }

}
