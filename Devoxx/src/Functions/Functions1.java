package Functions;

import java.util.*;

public class Functions1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //External Iterators, Imperative Style of coding
        int result = 0;
        for (int e : numbers) {

            if (e % 2 == 0) {
                result += e * 2;
            }
        }
        System.out.println(result);

        //Internal Iterators, Declarative/Functional Style of coding
        System.out.println(
                        numbers
                        .stream()
                        .filter(number -> number % 2 == 0)
                        .mapToInt(number -> number * 2)
                        .sum());
    }

/*
Imperative      Declarative
1.how             what
2.mutate          transform
3.side effects    pure
4.pass objects    pass functions also
5.hard to compose functional composition

Benefits:

1.Code clarity
2.Less Error prone
3.Easy to parallelize


Functional Programming removes accidental complexity from our code

 */


}
