package Functions;

import java.util.List;
import java.util.stream.Stream;

public class Functions2 {


    public static void main(String[] args) {

        int k = 121;
        int n = 51;
        System.out.println(compute(k, n));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);

        System.out.println(numbers.stream()
                .filter(each -> each % 2 == 0)
                .filter(each -> each > 3)
                .findFirst()
                .orElse(0));
    }

    public static int compute(int k, int n) {

        return Stream.iterate(k, each -> each + 1)
                .filter(each -> each % 2 == 0)
                .filter(each -> Math.sqrt(each) > 20)
                .mapToInt(each -> each * 2)
                .limit(n)
                .sum();
    }
/*

Any function that returns a stream from a stream is lazy
Any function that returns a non-stream from a stream is eager

Lazy evaluation : good for performance , efficiency , postpones creating objects and hence less garbage is created

*/

}
