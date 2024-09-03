package Java9;

import java.util.List;

public class TakeWhileExample {
    public static void main(String[] args) {
        var numbers = List.of(1, 6, 9, 51, 16, 18, 45, 79);

        System.out.println(numbers
                .stream()
                .takeWhile(e -> e < 50)
                .toList());

        System.out.println(numbers
                .stream()
                .dropWhile(e -> e < 50)
                .toList());
    }
}
