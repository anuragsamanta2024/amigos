package Optionals;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("Send email to " + email));

        Optional.empty()
                .ifPresent(email -> System.out.println("Send email to " + email));

/*
       Optional.of(null)
        .ifPresent(email -> System.out.println("Send email to " + email));
 */

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Send email to " + email),
                        () -> System.out.println("Email cannot be sent"));

        Object value = Optional.ofNullable(null).orElseGet(() -> "Value not present");
        System.out.println(value);

        //  Optional.ofNullable(null).orElseThrow(NoSuchElementException::new);


    }
}
