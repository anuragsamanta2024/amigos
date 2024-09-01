package Functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumers {

    public static void main(String[] args) {

        consumer.accept("Hello");
        biConsumer.accept("Hello", "World");

    }

    static Consumer<String> consumer = System.out::println;
    static BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + " " + str2);

}
