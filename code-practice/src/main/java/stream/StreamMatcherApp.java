package stream;

import java.util.stream.Stream;

public class StreamMatcherApp {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("Washing Machine", "Television", "Laptop", "Grocery");
        Stream<String> stream2 = Stream.of("Washing Machine", "Television", "Laptop", "Grocery");
        Stream<String> stream3 = Stream.of("Washing Machine", "Television", "Laptop", "Grocery");

        boolean anyMatchFound = anyMatch(stream1);
        boolean allMatchFound = allMatch(stream2);
        boolean noneMatchFound = noneMatch(stream3);

        System.out.println("AnyMatchFound:" + anyMatchFound);
        System.out.println("AllMatchFound:" + allMatchFound);
        System.out.println("NoneMatch:" + noneMatchFound);
    }

    static boolean anyMatch(Stream<String> stream) {
        return stream.anyMatch(each -> each.equals("Laptop"));
    }

    static boolean allMatch(Stream<String> stream) {
        return stream.allMatch(each -> each.equals("Laptop"));
    }

    static boolean noneMatch(Stream<String> stream) {
        return stream.noneMatch(each -> each.equals("Laptop"));
    }
}
