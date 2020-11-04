package homeworkAll.TaskExceptions;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Дан список пользователей с банковскими счетами. Написать программу, которая проверяет правильность
        // пользовательских данных по следующим трем правилам:
        // Клиент должен быть не моложе 17 лет
        // Банковский iban должен быть длиной 16
        // Первые два символа iban должны быть "DE"
        //Программа должна выводить все ошибки. То есть, например, если у пользователя есть банковский счет длины 10 и
        //начинающийся на "IT", то должно печататься два сообщения об ошибке.
        List<Customer> customers = Arrays.asList(
                new Customer("Olga", 14, new BankAccount("IT77777788889")),// 3 ошибки
                new Customer("Oleg", 88, new BankAccount("IE777777")),// 2 ошибки
                new Customer("Lora", 17, new BankAccount("DE77777788889999")));// без ошибок
        for (Customer customer : customers) {
            try {
                checkAgeCustomer(customer);
            } catch (InvalidCustomerAgeExceptionException ex) {
                System.out.println(ex.getMessage());
            }

            try {
                checkLengthBankAccount(customer);
            } catch (InvalidLengthAccountException ex) {

            }
            try {
                checkBankAccount(customer);
            } catch (InvalidBankAccount ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void checkAgeCustomer(Customer customer) throws InvalidCustomerAgeExceptionException {
        if (customer.getAge() < 17) {
            throw new InvalidCustomerAgeExceptionException("Invalid age for IBAN: " + customer.getAccount().getIban() +
                    " Customer: " + customer.getName());
        }
    }

    public static void checkLengthBankAccount(Customer customer) throws InvalidLengthAccountException {
        if (customer.getAccount().getIban().length() != 16) {
            throw new InvalidLengthAccountException("Invalid length of IBAN: " + customer.getAccount().getIban() +
                    " Customer: " + customer.getName());
        }
    }

    public static void checkBankAccount(Customer customer) throws InvalidBankAccount {
        if (!customer.getAccount().getIban().substring(0, 2).equals("DE")) {
            throw new InvalidBankAccount("Invalid type of IBAN: " + customer.getAccount().getIban() +
                    " Customer: " + customer.getName());
        }
    }
}
