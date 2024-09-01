package leetcode;

import java.util.*;

public class Duplicate {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(isDuplicate(numbers));
    }

    private static boolean isDuplicate(int[] numbers) {
        Set<Integer> set = new HashSet<>(Arrays.stream(numbers).boxed().toList());
        return set.size() != numbers.length;
    }
}
