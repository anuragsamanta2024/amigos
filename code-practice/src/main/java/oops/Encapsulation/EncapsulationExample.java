package oops.Encapsulation;

public class EncapsulationExample {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    EncapsulationExample(String name, int age) {
        this.name = name;
        this.age = age;

    }
/*
1.Instance variables are made private, so they can only be accessed and modified through getters and setters
2.We can change the implementation details of the class, without affecting the classes that are using it.

 */
}
