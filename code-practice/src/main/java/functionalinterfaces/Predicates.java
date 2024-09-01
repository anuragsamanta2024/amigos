package functionalinterfaces;

import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {

        Predicate<String> andPredicate = startsWithJ.and(endsWithN);
        System.out.println("And Predicate: " + andPredicate.test("John"));

        Predicate<String> negatePredicate = startsWithJ.and(endsWithN).negate();
        System.out.println("Negate Predicate: " + negatePredicate.test("John"));

        boolean startsWithAAndEndsWithGPredicate = startsWithJAndEndsWithN.test("John");
        System.out.println("Test Method: " + startsWithAAndEndsWithGPredicate);

        boolean isEqual = Predicate.isEqual("John").test("John");
        System.out.println("Is Equal Method: " + isEqual);

        boolean notPredicate = Predicate.not(startsWithJAndEndsWithN).test("John");
        System.out.println("Not Predicate: " + notPredicate);

    }

    static Predicate<String> startsWithJ = name -> name.startsWith("A");
    static Predicate<String> endsWithN = name -> name.endsWith("g");

    static Predicate<String> startsWithJAndEndsWithN = name -> name.startsWith("J") && name.endsWith("n");

}
