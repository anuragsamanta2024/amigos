package Exercise.exercise;

import java.util.stream.Stream;

public class E4 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .parallel()
                .map(E4::transform)
                .sequential()
                .forEach(E4::print);
    }

    public static int transform(int number) {
        System.out.println("transform: " + Thread.currentThread());
        return number * 2;
    }

    public static void print(int number) {
        System.out.println("print: " + Thread.currentThread());
        System.out.println(number);
    }
}

//code may run in main thread or common pool thread (multithreaded)

//What threads do transform and print run in?
//transform: main
//print: main

/*
Java 8 streams does not segment the pipeline for different threading model.
The last call to parallel or sequential before the terminal call, sets the threading model for the entire pipeline.

 */



