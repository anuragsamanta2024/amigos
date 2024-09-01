package oops.abst.intface.intf;

public class MainClass {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        System.out.println(animal.age);
        System.out.println(animal.name);
    }

}
