package java8.pratice;

import java.util.Collections;
import java.util.List;

public class SecondHighestSalary {

    public static void main(String[] args) {

        List<Student> students = List.of(new Student("John", "5000"),
                new Student("Jim", "7000"),
                new Student("Mike", "3000"),
                new Student("Bob", "2000"),
                new Student("Betty", "3000"),
                new Student("Jack", "7000"),
                new Student("Jill", "8000"),
                new Student("Jim", "6000"),
                new Student("Bane", "5000")
        );

        secondHighest(students);
        lowest(students);
        fourthHighest(students);
        thirdLowest(students);

    }

    static void secondHighest(List<Student> students) {

        students
                .stream()
                .map(Student::getSalary)
                .sorted(Collections.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .ifPresentOrElse(each -> System.out.println("Second highest salary" + each),
                        () -> System.out.println("Not found"));

    }

    static void lowest(List<Student> students) {

        students
                .stream()
                .map(Student::getSalary)
                .sorted()
                .findFirst()
                .ifPresentOrElse(each -> System.out.println("LowestSalary: " + each),
                        () -> System.out.println("Not found"));

    }

    static void fourthHighest(List<Student> students) {
        students
                .stream()
                .map(Student::getSalary)
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(3)
                .findFirst()
                .ifPresentOrElse(each -> System.out.println("FourthHighestSalary: " + each),
                        () -> System.out.println("Not found"));

    }

    static void thirdLowest(List<Student> students) {
        students
                .stream()
                .map(Student::getSalary)
                .distinct()
                .sorted()
                .skip(2)
                .findFirst()
                .ifPresentOrElse(each -> System.out.println("ThirdLowestSalary: " + each),
                        () -> System.out.println("Not found"));
    }


    static class Student {
        String name;
        String salary;

        Student(String name, String salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Student{" +
                    ", name='" + name + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
