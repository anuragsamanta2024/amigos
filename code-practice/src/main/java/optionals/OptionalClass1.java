package optionals;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClass1 {

    public static void main(String[] args) {
        Optional<String> name = getName();
        if (name.isPresent()) {
            System.out.println(name.get()); // does not work if data is null
        }
        name.map(String::toUpperCase).ifPresent(System.out::println);

        //System.out.println(name.orElse("NA"));
        System.out.println(name.orElseGet(() -> "NA"));
        System.out.println(name.orElseThrow());
        System.out.println(name.orElseThrow(NoSuchElementException::new));
    }

    private static Optional<String> getName() {
        // return Optional.of("Anurag");
        //  return Optional.empty();
        //  return Optional.of(null);
        return Optional.ofNullable("Anurag");
        //return Optional.ofNullable(null);
    }
}
