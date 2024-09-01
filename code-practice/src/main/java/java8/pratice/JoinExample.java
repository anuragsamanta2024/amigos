package java8.pratice;

import java.util.List;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class JoinExample {

    public static void main(String[] args) {

        joinExample();
        stringJoiner();
        collectJoin();
        skipAndLimit();

    }


    private static void joinExample() {
        List<String> stringList = Stream.of("1", "2", "4", "5").toList();
        String result = String.join("/", stringList);
        System.out.println(result);
    }

    private static void stringJoiner() {

        StringJoiner stringJoiner = new StringJoiner("/", "%", "%");
        stringJoiner.add("Java");
        stringJoiner.add("Test");
        System.out.println(stringJoiner);
    }

    private static void collectJoin() {
        List<String> stringList = Stream.of("1", "2", "4", "5").toList();
        String join = stringList.stream().collect(joining("/", "%", "%"));
        System.out.println(join);
    }

    private static void skipAndLimit() {
        IntStream
                .rangeClosed(1, 10)
                .skip(1)
                .limit(3)
                .forEach(System.out::println);

        new Random().ints().limit(3).forEach(System.out::println);
    }

}
