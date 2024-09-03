package Exercise.exercise;

import java.util.*;
import java.util.stream.IntStream;

public class E5 {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> IntStream
                .rangeClosed(1, 10)
                .forEach(System.out::print));
        thread.start();

        var numbers = List.of(1, 2, 3);
        var doubled = numbers
                .stream()
                .map(each -> each * 2)
        //        .collect(toList()); // mutable
        .toList();//immutable
        doubled.add(22);

        System.out.println(doubled);

        // Start a thread

    }
}
