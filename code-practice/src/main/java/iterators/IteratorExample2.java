package iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class IteratorExample2 {

    public static void main(String[] args) {

        Map<String, Integer> bookAndPrice = new HashMap<>();
        bookAndPrice.put("Java book1", 100);
        bookAndPrice.put("Java book2", 300);
        bookAndPrice.put("Book on Java", 200);
        bookAndPrice.put("New Book", 50);

//        System.out.println(bookAndPrice);
//        for (String each : bookAndPrice.keySet()) {
//            if (each.contains("Java")) {
//                bookAndPrice.remove(each);
//            }
//        }
        System.out.println(bookAndPrice);
        Iterator<String> iterator = bookAndPrice.keySet().iterator();
        while (iterator.hasNext()) {

            if (iterator.next().contains("Java")) {
                bookAndPrice.put("Hello", 1);
            }
        }
        System.out.println(bookAndPrice);

    }
}
