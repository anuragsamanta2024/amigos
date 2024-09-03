package parallel;

import java.util.List;

public class Sample {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list
                .parallelStream()
                .map(Sample::transform)
                .forEachOrdered(Sample::printIt);
    }

    private static int transform(int numbers) {
        System.out.println(Thread.currentThread());
        return numbers;
    }

    private static void printIt(int numbers) {
        System.out.println(Thread.currentThread());
        System.out.println(numbers);
    }
}
