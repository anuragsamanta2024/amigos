package mutables;

import java.util.HashMap;
import java.util.Map;

public class App1 {

    public static void main(String[] args) {
        Student student = new Student("John");
        Map<Student, String> map = new HashMap<>();

        map.put(student, "India");
        student.setName("Mike");

        System.out.println(map.get(student));
    }
}
