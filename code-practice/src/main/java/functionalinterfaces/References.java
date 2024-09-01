package functionalinterfaces;

import java.util.stream.Stream;

public class References {

    public static void main(String[] args) {

        Stream.of(1, 2, 4, 6, 8)
                .filter(each -> each > 1)
                .skip(1)
                .sorted((a, b) -> b - a)
                .forEach(References::accept);

        Stream.of("John", "Becky", "Alice")
                .map(Stud::new).forEach(System.out::println);
    }


    static void accept(Integer number) {
        System.out.println(number);
    }

    static void accept(String name) {
        System.out.println(name);
    }

    static class Stud {

        String name;

        @Override
        public String toString() {
            return "Stud{" +
                    "name='" + name + '\'' +
                    '}';
        }

        Stud(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
