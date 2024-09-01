package java8.pratice;

import java.util.Arrays;

public class LongestString {

    public static void main(String[] args) {

        String[] input = {"Java1", "Java", "Spring", "Mongo"};
        longestString(input);
        System.out.println("-------------------------");
        collectAndPrint(input);
    }

    private static void longestString(String[] input) {

        String longest = Arrays
                .stream(input)
                .reduce((w1, w2) -> checkLength(w1, w2)).get();
        System.out.println(longest);
    }

    private static void collectAndPrint(String[] input) {
        Arrays
                .stream(input)
                .forEach(System.out::println);
    }

    private static String checkLength(String w1, String w2) {

        return w1.length() > w2.length() ? w1 : w2;

    }
}
