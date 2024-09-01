package CombinatorPattern;

import java.sql.SQLOutput;
import java.time.LocalDate;

import static CombinatorPattern.CustomerRegistrationValidator.*;

public class MainClass {

    public static void main(String[] args) {

        Customer customer = new Customer("John", "@gmail.com", "7008961553", LocalDate.of(1992, 11, 10));

        String result = new CustomerValidationService().isValidCustomer(customer) ? "Valid Customer" : "Not Valid Customer";

        System.out.println(result);

        ValidationResult validationResult = CustomerRegistrationValidator.isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);
        System.out.println(validationResult);
    }
}
