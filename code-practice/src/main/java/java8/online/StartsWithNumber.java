package java8.online;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

public class StartsWithNumber {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("hello", "0byte", "9hello", "world");
        String startsWithDigit = stringList
                .stream()
                .filter(each -> Character.isDigit(each.charAt(0)))
                .collect(joining(", "));
        System.out.println(startsWithDigit);

    }


}
