package functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {

        List<Student> list = listFunction.apply(Arrays.asList(new Student("1", "Beck"),
                new Student("2", "John")));
        System.out.println("List :" + list);

        Function<String, Integer> composedFunction = function1.andThen(function2);
        Integer integer = composedFunction.apply("hello");
        System.out.println(integer);

        Function<String, String> identityFunction = Function.identity();
        String name = identityFunction.apply("John");
        System.out.println(name);

    }

    static Function<List<Student>, List<Student>> listFunction = student -> {
        List<Student> validStudent = new ArrayList<>();
        student.forEach(each -> {
            if (each.getId().equals("1")) {
                validStudent.add(each);
            }
        });
        return validStudent;
    };

    static Function<String, String> function1 = String::toUpperCase;
    static Function<String, Integer> function2 = String::length;

}

class Student {

    String id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public String getId() {
        return id;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}


