package java8.pratice;

import static java.util.stream.Collectors.*;

import java.util.*;

public class StringsToEven {

    public static void main(String[] args) {

        String str = "1,2,3,4,5,6,7,8,9,10";
        String newStr = Arrays.stream(str.split(","))
                .mapToInt(Integer::parseInt)
                .filter(each -> each % 2 == 0)
                .mapToObj(Objects::toString)
                .collect(joining());

        System.out.println(newStr);

    }
}
