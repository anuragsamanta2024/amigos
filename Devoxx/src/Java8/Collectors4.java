package Java8;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Collectors4 {

    public static void main(String[] args) {

        //flat Map

        List<Integer> numbers = List.of(1, 2, 3);

        //one to one function
        //Stream<T>.map(f11) ==> Stream<R>
        System.out.println(numbers
                .stream()
                .map(e -> e * 2)//one to one function
                .collect(toList()));

        //one to many function
        //Stream<T>.map(f1n) ==> Stream<List<R>>
        System.out.println(numbers
                .stream()
                .map(e -> List.of(e + 1, e - 1))
                .collect(toList()));

        //one to one function
        //Stream<T>.???(f1n) ==> Stream<R>

        System.out.println(numbers
                .stream()
                .flatMap(e -> List.of(e + 1, e - 1).stream())
                .collect(toList()));

        List<List<Integer>> lists = List.of(List.of(1, 2, 3));
        List<Integer> list = lists.stream().flatMap(each -> each.stream()).toList();
        System.out.println(lists);
        System.out.println("LIST:"+list);

        //stream().
        //map(Function<T,R>) ==> Stream<R>

        //stream().
        //flatMap(Function<T, Stream<R>>) ==> Stream<R>

        /*

        If you have a one-to-one function,
        use a map to go from Stream<T> to Stream<R>

        If you have a one-to-many function,
        use a map to go from Stream<T> to Stream<Collection<R>>

        If you have a one-to-many function,
        use a flatMap to go from Stream<T> to Stream<R>

         */


        System.out.println(createPeople()
                .stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getName, toList()))));

        System.out.println(createPeople()
                .stream()
                .collect(groupingBy(Person::getAge,
                        flatMapping(person ->
                                Stream.of(person.getName().split("")), toList()))));


        System.out.println(createPeople()
                .stream()
                .collect(groupingBy(Person::getAge,
                        flatMapping(person ->
                                Stream.of(person.getName().split("")), toSet()))));

        System.out.println(createPeople()
                .stream()
                .collect(groupingBy(Person::getAge,
                        mapping(person -> person.getName().toUpperCase(),
                                flatMapping(name ->
                                        Stream.of(name.split("")), toSet())))));


    }

    public static List<Person> createPeople() {
        return List.of(
                new Person("Sara", 20),
                new Person("Sara1", 20),
                new Person("Sara2", 22),
                new Person("Bob", 20),
                new Person("Paula", 32),
                new Person("Paul", 32),
                new Person("Jack", 3),
                new Person("Bill", 72),
                new Person("Jill", 11)
        );
    }
}
