package Functions;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class UnaryBinary {

    public static void main(String[] args) {

        String upperCase = unaryOperator.apply("hello");
        System.out.println(upperCase);

        int productOfTwoNumbers = binaryOperator.apply(2, 3);
        System.out.println(productOfTwoNumbers);

        Function<Integer, Integer> function1 = num -> num * 2;
        System.out.println(function1.apply(4));

        Supplier<String> supplier = () -> "A";
        System.out.println(supplier.get());
    }

    static UnaryOperator<String> unaryOperator = String::toUpperCase;
    static BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 * num2;
}
