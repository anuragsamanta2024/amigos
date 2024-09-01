package CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidationService {

    private boolean isEmailValid(Customer customer) {
        return customer.getEmail().contains("@");

    }

    private boolean isPhoneNumberValid(Customer customer) {
        return customer.getPhoneNumber().startsWith("91");

    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;

    }

    public boolean isValidCustomer(Customer customer) {
        return isEmailValid(customer) && isPhoneNumberValid(customer) && isAdult(customer.getDob());
    }
}
