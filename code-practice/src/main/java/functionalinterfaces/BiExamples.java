package functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiExamples {
    public static void main(String[] args) {

        boolean first = biPredicate.test("Alex", 23);
        System.out.println(first);

        Integer length = biFunction.apply("Hello", "There");
        System.out.println(length);

        biConsumer.accept("hello", "there");

    }

    static BiPredicate<String, Integer> biPredicate = (name, age) -> name.startsWith("A") && age > 18;

    static BiFunction<String, String, Integer> biFunction = (str1, str2) -> (str1 + str2).length();

    static BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + "," + str2);
}
