package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Suppliers {

    public static void main(String[] args) {

        Long longSupplier = count.get();
        System.out.println(longSupplier);

        List<String> stringList = topAutoMobileBrands.get();
        System.out.println(stringList);

        Suppliers suppliers = new Suppliers();
        System.out.println(suppliers.return1.get());
    }

    static Supplier<Long> count = () -> IntStream
            .rangeClosed(1, 10)
            .filter(each -> each > 5 && each % 2 == 0)
            .count();

    static Supplier<List<String>> topAutoMobileBrands = () -> Arrays.asList("Tata Motors", "Mahindra");

    Supplier<Integer> return1 = () -> 1;
}
