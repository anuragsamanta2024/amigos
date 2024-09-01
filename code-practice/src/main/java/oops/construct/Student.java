package oops.construct;

public class Student {
    String name;

    Student(String name) {
        this.name = name;

    }

    Student(Student student) {
        this.name = student.name;
    }

    void print() {
        System.out.println("print");
    }

    public static void main(String[] args) {
        Student student1 = new Student("John");
        Student student2 = new Student(student1);
        Student student3 = student1;
        student1.print();
        student2.print();
        student3.print();
        //  Student student4 = (Student) student3.clone();


    }
}
