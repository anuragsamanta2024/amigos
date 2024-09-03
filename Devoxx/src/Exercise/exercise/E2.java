package Exercise.exercise;

import java.util.Arrays;
import java.util.List;

public class E2 {
    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(1, 2, 3);
     //  List<Integer> numbers = List.of(1, 2, 3);
        //List.of is immutable
        //Set.of does not allow duplicates
        //Map.of
        //of methods do not permit null
        try {
            numbers.add(4);
        } catch (Exception e) {
            System.out.println("Add Unsupported");
        }

        try {
            numbers.set(2, 2);
        } catch (Exception e) {
            System.out.println("Set Unsupported");
        }
        System.out.println(numbers);


    }
}
