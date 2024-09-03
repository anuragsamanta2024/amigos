package Exercise.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class E1 {

    public static void main(String[] args){
      List<Integer> numbers = new ArrayList<>(List.of(1,2,3));
      //Collection<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);

    }
}
