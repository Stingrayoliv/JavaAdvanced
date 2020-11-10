package moduleSecond.lesson05112020ExeptionTask.validator;

import moduleSecond.lesson05112020ExeptionTask.entity.Customer;
import moduleSecond.lesson05112020ExeptionTask.exeptions.InvalidCustomerException;
import moduleSecond.lesson05112020ExeptionTask.exeptions.InvalidIbanLengthException;

import java.util.List;

public class Validator {
    public static void validate(List<Customer> customers) {
        for (Customer c : customers) {
            validateCustomer(c);
        }
    }

    public static void validateCustomer(Customer customer) {
        try {
            validateAge(customer);
        } catch (InvalidCustomerException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            validateIbanLength(customer);
        } catch (InvalidIbanLengthException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void validateAge(Customer customer) throws InvalidCustomerException {
        if (customer.getAge() < 17) {
            throw new InvalidCustomerException("Ivalid age " + customer.getAge() + "for customer" + customer.getName());
        }
    }

    public static void validateIbanLength(Customer customer) throws InvalidIbanLengthException {
        if (customer.getBankAccount().getIBAN().length() != 8) {
            throw new InvalidIbanLengthException("Ivalid age " + customer.getAge() + "for customer" + customer.getName());
        }
    }
}
