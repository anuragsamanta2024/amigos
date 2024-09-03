package Java8;

import java.util.Arrays;
import java.util.List;


public class Streams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers
                .stream()
                .filter(each -> each % 2 == 0)
                .map(each -> each * 2)
                .forEach(each -> System.out.print(each + " "));

        System.out.println();

        List<Integer> doubleOfEven = numbers
                .stream()
                .filter(each -> each % 2 == 0)
                .map(each -> each * 2)
                .toList();

        System.out.print(doubleOfEven);
    }
}
