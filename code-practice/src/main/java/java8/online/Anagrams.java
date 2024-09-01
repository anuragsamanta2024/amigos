package java8.online;

import static java.util.stream.Collectors.*;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String s1 = "Java learning";
        String s2 = "Java is growing";

        boolean result = Arrays.stream(s1.split(""))
                .map(String::toUpperCase)
                .collect(joining())
                .equalsIgnoreCase(Arrays.stream(s2.split(""))
                        .map(String::toUpperCase)
                        .collect(joining()));
        System.out.println(result ? "Anagrams" : "Not Anagrams");


        String s3 = "Java is a good programming language";
        Long count = Arrays.stream(s3.trim().split("\\s+")).count();
        System.out.println(count);
    }
}
