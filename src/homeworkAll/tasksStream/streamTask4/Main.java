package homeworkAll.tasksStream.streamTask4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * JavaAdvanced
 * 15.10.20
 */

public class Main {
    public static void main(String[] args) {
        //4. нужно написать функцию, которая возвращает мапу, где значением является Person, а значением - список
        // его банковских счетов

        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("122222222222", new Person("Lora")),
                new BankAccount("133333333333", new Person("Oleg")),
                new BankAccount("287878787877", new Person("Anna")),
                new BankAccount("266666666999", new Person("Anna")));
        System.out.println("//----//----Task 4----//----//");
        Map<Person, List<BankAccount>> accountsByPerson = bankAccounts.stream().collect(Collectors.
                groupingBy(BankAccount::getOwner));
        accountsByPerson
                .forEach((p, IBAN) -> System.out.format("person %s: %s\n", p, IBAN));
    }
}
