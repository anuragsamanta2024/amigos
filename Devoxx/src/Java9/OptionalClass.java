package Java9;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class OptionalClass {

    static void process(Optional<Integer> number) {

        // System.out.println(number.get()); don't use get() as it might return null if value is null
        //    System.out.println(number.orElse(0));
        //   System.out.println(number.orElseThrow());
        //  System.out.println(number.orElseThrow((() -> new RuntimeException("No element found"))));
        //    number.ifPresent(value -> System.out.println("Value is " + value));
        number.ifPresentOrElse(value -> System.out.println("Value is " + value),
                () -> System.out.println("No element found"));


    }

    public static void main(String[] args) {
        List<Integer> numbers = IntStream
                .rangeClosed(1, 10)
                .boxed()
                .toList();

        process(numbers.
                stream()
                .filter(each -> each > 5)
                .findFirst());

        System.out.println("----------------------------");

        process(numbers.
                stream()
                .filter(each -> each > 50)
                .findFirst());

    }
}


/*
don't send Optional as a parameter to a function
 */
