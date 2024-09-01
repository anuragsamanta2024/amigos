package oops.Polymorphism;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
    public void makeSound(String sound){
        System.out.println("Woof");
    }
}
