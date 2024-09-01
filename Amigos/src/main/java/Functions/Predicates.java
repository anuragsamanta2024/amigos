package Functions;

import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid.test("917008961551"));
        System.out.println(isPhoneNumberValid.test("837008961551"));
        System.out.println(isPhoneNumberValid.test("91700896167"));

        System.out.println(isPhoneNumberValid.and(contains6).test("917008961551"));
        System.out.println(isPhoneNumberValid.or(contains6).test("91700896"));

    }

    static Predicate<String> isPhoneNumberValid = phoneNumber -> phoneNumber.startsWith("91") && phoneNumber.length() == 12;

    static Predicate<String> contains6 = phoneNumber -> phoneNumber.contains("6");

}
