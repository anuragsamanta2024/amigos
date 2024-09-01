package Functions;

import java.util.function.*;

public class Functions2 {

    public static void main(String[] args) {

        int incrementBy1 = incrementByOne.apply(1);
        System.out.println(incrementBy1);

        int multiplyBy10 = multiplyByTen.apply(2);
        System.out.println(multiplyBy10);

        int addAndMultiply = incrementByOne.andThen(multiplyByTen).apply(1);
        System.out.println(addAndMultiply);

        int multiplyTwoNumbers = biFunction.apply(2, 3);
        System.out.println(multiplyTwoNumbers);

        System.out.println((biFunction.apply(1, 3).equals(binaryOperator.apply(1,3))));

        System.out.println(multiplyByTen.apply(3).equals(unaryOperator.apply(3)));
         Function<Integer, Integer> incrementByOne = number -> number + 1;


    }

    static Function<Integer, Integer> incrementByOne = number -> number + 1;
    static Function<Integer, Integer> multiplyByTen = number -> number * 10;
    static UnaryOperator<Integer> unaryOperator = number -> number * 10;
    static BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> num1 * num2;
    static BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 * num2;

}



