package coding;

import java.util.stream.IntStream;

public class Prime {

    public static void main(String[] args) {
        int n = 6;
        boolean value = IntStream.rangeClosed(2, n / 2).noneMatch(each -> n % each == 0);
        System.out.println(value);
    }
}
