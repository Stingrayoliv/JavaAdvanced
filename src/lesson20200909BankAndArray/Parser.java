package lesson20200909BankAndArray;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Parser {
    public static Account[] parseStringArrayToAccount(String[] array, Function<String, Account> function) {
        Account[] temp = null; //логичнее использовать List
        Account[] result = null; // страхуемся так, если придут нули
        if (array != null && function != null) {
            temp = new Account[array.length];
            int index = 0; // добавляем индекс
            for (String string : array) { // для каждого массива array вызываем function (в котором есть apply)
                Account account = function.apply(string);
                if (account != null) {
                    temp[index++] = account;
                }
            }
            result = new Account[index];
            System.arraycopy(temp, 0, result, 0, index); // могут быть пустые строки из-за
            // того ого, что account был 0 нужно, если все ячейки заполнилист, чтобы избежать
        }
        return result;
    }

    public static Account[] parseStringList(String[] array, Function<String, Account> function) {
        List<Account>temp = new ArrayList<>();
        Account[]res = null;
        if (array != null && function != null) {
            int index = 0; // добавляем индекс
            for (String string : array) { // для каждого массива array вызываем function (в котором есть apply)
                Account account = function.apply(string);
                if (account != null) {
                    temp.add(account);
                }
            }
            res = new Account[temp.size()];
            temp.toArray(res);
        }
        return res;
    }
}
