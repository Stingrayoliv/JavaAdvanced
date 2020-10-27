package homeworkAll.tasksStream.streamTasks4And5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //5. Написать функцию, которая для списка счетов, возвращает список IBANNs, где в каждом IBANN символы после
        // 3-го и до конца заменены звездочками.
        Stream<String> result = bankAccounts.stream().map(BankAccount::getIBAN).
                map(Main::makeNewStringWithStars);
        System.out.println("Task 5: ");
        result.forEach(System.out::println);
    }

    public static String makeNewStringWithStars(String s) {
        String result = "";
        for (int i = 3; i < s.length(); i++) {
            result += "*";
        }
        return s.substring(0, 3).concat(result);
    }
}
