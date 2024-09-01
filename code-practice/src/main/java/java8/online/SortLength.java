package java8.online;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLength {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Mars", "Devil", "hearing");
        List<String> sorted = list
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();
        System.out.print(sorted);
    }
}
