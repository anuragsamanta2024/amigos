package coding;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Palindrome {

    public static void main(String[] args) {
        int number = 16461;
        String name = "dad";
        String value = String.valueOf(number);

        boolean b = IntStream.range(0, value.length() / 2)
                .allMatch(each -> value.charAt(each) == value.charAt(value.length() - each - 1));

        System.out.println(b ? "Palindrome" : "Not Palindrome");

        boolean b1 = Stream
                .iterate(0, n -> n + 1)
                .limit(name.length() / 2)
                .allMatch(each -> name.charAt(each) == name.charAt(name.length() - each - 1));
        System.out.println(b1 ? "Palindrome" : "Not Palindrome");


    }
}
