package iterators;

import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        List<String> listOfNames = Arrays.asList("Sachin", "Ganguly", "Dravid", "Laxman", "Viru");
     //   List<String> listOfNames = new LinkedList<String>(Arrays.asList("Sachin", "Ganguly", "Dravid", "Laxman", "Viru"));
        namesList.addAll(listOfNames);
        for (String name : namesList) {
            System.out.println(name);
            //     namesList.remove(2);
        }

        System.out.println("---------------------");

        Iterator<String> playersIterator = namesList.iterator();
        if (playersIterator.hasNext()) {
            String currentPlayerName = playersIterator.next();
            if (currentPlayerName.equalsIgnoreCase("Ganguly")) {
                playersIterator.remove();
            }
        }
        for (String name : namesList) {
            System.out.println(name);

        }

    }
}
