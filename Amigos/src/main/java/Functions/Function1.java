package Functions;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static Functions.Function1.Gender.*;

public class Function1 {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        //Predicate
        Predicate<Person> predicate = gender -> gender.getGender().equals(FEMALE);
        System.out.println(predicate.test(new Person("John", MALE)));


        //Function
        Function<Person, String> function = Person::getName;
        function.apply(new Person("John", MALE));


        //Consumer
        Consumer<Person> consumer = person -> System.out.println(person.name + " is " + person.gender);
        consumer.accept(new Person("John", MALE));


        //BiConsumer
        BiConsumer<Person, Boolean> biConsumer = (person, printName) -> System.out.println((printName) ? person.name : "****");
        biConsumer.accept(new Person("Anurag", MALE), false);

        List<String> names = people
                .stream()
                .filter(predicate)
                .map(function)
                .toList();

        System.out.println(names);

        people.stream()
                .filter(each -> each.getGender().equals(FEMALE))
                .toList()
                .forEach(System.out::println);
    }

    static class Person {

        private String name;
        private Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }
}
