package mutables;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        ChildStudent childStudent = new ChildStudent("Mike");
        ParentStudent parentStudent = childStudent;

        Map<ParentStudent, String> map = new HashMap<>();
        map.put(parentStudent, "India");

        childStudent.setName("John");
        System.out.println(map.get(parentStudent));


    }
}
