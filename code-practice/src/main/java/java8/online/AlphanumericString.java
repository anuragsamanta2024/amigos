package java8.online;

import java.util.Arrays;

public class AlphanumericString {

    public static void main(String[] args) {
        String str = "a1b2c3d4e5f6g7h8i9j0";
        Arrays.stream(str.split(""))
                .filter(each -> Character.isDigit(each.charAt(0)))
                .forEach(System.out::print);
    }
}
