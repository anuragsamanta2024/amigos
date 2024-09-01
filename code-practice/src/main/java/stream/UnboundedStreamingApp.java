package stream;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class UnboundedStreamingApp {
    public static void main(String[] args) {

        List<String> randomUUID = generateStream().toList();
        System.out.println(randomUUID);

        List<Integer> randomNumbers = iterateStream().toList();
        System.out.println(randomNumbers);

    }

    private static Stream<String> generateStream() {
        return Stream
                .generate(() -> UUID.randomUUID().toString())
                .limit(3)
                .skip(1);
    }

    private static Stream<Integer> iterateStream() {

        return Stream
                .iterate(0, n -> n + 1)
                .limit(3)
                .skip(1);

    }
}
