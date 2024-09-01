package java8.online;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 6, 7);
        Optional<Integer> optional = Optional.ofNullable(list.get(0));
        System.out.println(optional);
    }
}
