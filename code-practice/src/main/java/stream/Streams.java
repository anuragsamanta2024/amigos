package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Streams {

    public static void main(String[] args) {

        /*
        Create Stream
         */

        Stream<Integer> stream = Stream.iterate(0, n -> n + 1).limit(11).skip(1);
        stream.forEach(System.out::print);

        System.out.println();

        Stream<Integer> generate = Stream.generate(() -> (int) (Math.random() * 100)).limit(3);
        generate.forEach(System.out::print);

        System.out.println();


        /*
        Some Intermediate and terminal Operations
        distinct(), sorted()
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 8, 9, 0, 6, 7);
        List<Integer> integers = list
                .stream()
                .filter(each -> each % 2 == 0)
                .map(each -> each / 2)
                .distinct()
                .sorted((a, b) -> b - a)
                .toList();

        System.out.println("Integers:" + integers);

        /*
        limit(), skip(), max()
         */

        int max = Stream
                .iterate(0, n -> n + 1)
                .limit(11)
                .skip(1)
                .mapToInt(Integer::intValue)
                .max().orElse(0);


        System.out.println("Max: " + max);

        /*
        peek()
         */
        List<Integer> list2 = Stream
                .iterate(0, n -> n + 1)
                .limit(11)
                .skip(1)
                .peek(each -> System.out.print(each + " "))
                .toList();

/*
mim,max,peek,skip,limit
count

 */

    }
}

/*
JAVA-8 Q/A

1.Functional Interface:
Contains only one abstract method and any number of default and static methods

2.Runnable. Callable, Comparator

equals() overrides the equals() method from Object class

3.Write a Functional interface

4.Extending a functional interface from another functional interface
Multiple non-overriding methods found for interface

5.Different functional interfaces introduced in JAVA 8
Function, Predicate, Consumer, Supplier

6.Lambda Expression
1.Implementations of functional interfaces
2Target Types for functional interfaces.


Advantages of lambda expressions
1.We can avoid writing anonymous implementation
2.It saves a lot of code

Disadvantages
1.Difficult to write without an IDE
2.Complex to debug

Stream API:
Used to process collection of objects using functional style of programming

Stream:
Sequence of objects that supports various methods which can be pipelined to produce the desired result

Method Reference:
Short hand notation of a lambda expression to call a method







 */
