package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamingApp {

    public static void main(String[] args) {
        createFromNullable();
        processParallelStream();
        flatMapStream();
    }

    private static void createFromNullable() {

        Stream<String> stream = Stream.ofNullable(null);
        System.out.println(stream);
        System.out.println("---------------------------------------------------------");
    }


    private static void processParallelStream() {
        List<String> list = List.of("Television", "Grocery", "Laptop", "Washing Machine");
        list.parallelStream().forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        list.parallelStream().forEachOrdered(System.out::println);
        System.out.println("---------------------------------------------------------");
    }

    private static void flatMapStream() {
        List<List<String>> list1 = List.of(Arrays.asList("Television", "Grocery", "Laptop", "Washing Machine"));
        list1.parallelStream().flatMap(Collection::stream).forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        List<List<String>> list2 = List.of(
                Arrays.asList("Television", "Grocery", "Laptop", "Washing Machine"),
                Arrays.asList("Television", "Grocery", "Laptop", "Washing Machine"),
                Arrays.asList("Television", "Grocery", "Laptop", "Washing Machine"));

        list2.parallelStream().flatMap(each -> each.stream()).forEach(System.out::println);

    }
}
