package CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static CombinatorPattern.CustomerRegistrationValidator.*;
import static CombinatorPattern.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIl_NOT_VALID;

    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("91") ? SUCCESS : PHONE_NOT_VALID;

    }

    static CustomerRegistrationValidator isAnAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ?
                SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult validationResult = this.apply(customer);
            return validationResult.equals(SUCCESS) ? other.apply(customer) : validationResult;
        };
    }


    enum ValidationResult {
        SUCCESS,
        EMAIl_NOT_VALID,
        PHONE_NOT_VALID,
        IS_NOT_AN_ADULT
    }


}
