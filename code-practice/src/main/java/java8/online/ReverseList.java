package java8.online;

import java.util.*;

import static java.util.stream.Collectors.*;

public class ReverseList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "dad");
        List<String> reversedList = list
                .stream()
                .map(each -> reverseEach(each))
                .collect(toList());

        System.out.println(reversedList);
                Integer num1 = 1000,num2 = 1000;
                System.out.println(num1 == num2);//O/P: false
                Integer num3 = 20, num4 = 20;
                System.out.println(num3 == num4);//O/P:false
 }

    private static String reverseEach(String each) {
        String newStr = "";
        for (int i = each.length() - 1; i >= 0; i--) {
            newStr = newStr + each.charAt(i);
        }
        return newStr;
    }

}
