package Exercise.exercise;

import java.util.List;

public class E3 {
    //Lazy Evaluation
    public static void main(String[] args) {
        int[] factor = new int[]{2};
        var numbers = List.of(1, 2, 3);
        var stream = numbers
                .stream()
                .map(each -> each * factor[0]);

        factor[0] = 0;
        stream.forEach(System.out::println);
    }
}
/*
Note:
Pure Functions :-

Does not depend on the state of global variable

1.Does not change anything
2.Does not depend on anything that changes

1. Functional programming relies on lazy evaluation for efficiency of code
2. Lazy evaluation relies on purity of functions for correctness

Rules for purity:
1. The function should not make any change that is visible outside
2. The function should not depend on anything that may change from outside


Pure Functional programming has a set of rules to follow
1. No State
2. Pure Functions
3. No Side Effects



 */

