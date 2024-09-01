package collectors;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Collectors1 {

    public static void main(String[] args) {
        createStudentMap();
        createStudentSet();
        createStudentNamesTreeSet();
        groupByAges();
        intSummaryStatistics();
        convertObjectToString();
    }

    private static void createStudentMap() {
            /*
        Convert to map with no duplicates
         */

        // convertToMapWithNoDuplicates();
        Map<String, Integer> studentMap = createStudents()
                .stream()
                .collect(toMap(Student::getName, Student::getAge,
                        (a, b) -> a,
                        LinkedHashMap::new));
        System.out.println(studentMap);
        System.out.println("-----------------------------------------------------------");
    }

    private static void createStudentSet() {

    /*
    Accumulate names into a set
    */

        Set<Student> studentSet = new HashSet<>(createStudents());

        System.out.println(studentSet);
        System.out.println("-----------------------------------------------------------");
    }

    private static void createStudentNamesTreeSet() {
    /*
    Accumulate names into a treeSet
    */

        Set<String> studentTreeSet = createStudents()
                .stream()
                .map(Student::getName)
                .collect(toCollection(TreeSet::new));

        System.out.println(studentTreeSet);
        System.out.println("-----------------------------------------------------------");
    }

    private static void groupByAges() {

        Map<Integer, List<Student>> ages = createStudents()
                .stream()
                .collect(groupingBy(Student::getAge));
        System.out.println("Ages" + ages);
        System.out.println("-----------------------------------------------------------");
    }

    private static void intSummaryStatistics() {

        long count0 = createStudents().stream().count();
        long count1 = createStudents().stream().collect(counting());

        System.out.println(count0 + "-----" + count1);

        System.out.println("-----------------------------------------------------------");

        IntSummaryStatistics intSummaryStatistics = createStudents()
                .stream()
                .collect(summarizingInt(Student::getAge));


        System.out.println("IntSummaryStatistics:" + intSummaryStatistics);
        System.out.println("IntSummaryStatistics Average:" + intSummaryStatistics.getAverage());

        System.out.println("-----------------------------------------------------------");
    }

    private static void convertObjectToString() {
        String studentsString = createStudents().stream().map(Object::toString).collect(joining(","));
        System.out.println(studentsString);
    }

    static class Student {

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }


    }

    public static List<Student> createStudents() {
        return List.of(
                new Student("Sara", 20),
                new Student("Sara1", 20),
                new Student("Sara2", 22),
                new Student("Bob", 20),
                new Student("Paula", 32),
                new Student("Paul", 32),
                new Student("Jack", 3),
                new Student("null", 0),
                new Student("Jill", 72)
        );
    }
}
