package lesson20200909BankAndArray;

import java.util.function.Function;

public class ParseString implements Function<String, Account> {
    @Override
    public Account apply(String s) { // исходим из того, что строку проверит метод checkString(String s)
        if (checkString(s)) {
            String[] ownerAndIban = s.split(" Iban:");
            String[] typeAndName = ownerAndIban[0].split(":");
            Owner owner = null;
            if (typeAndName[0].isEmpty()) {
                // create Person
                String[] names = typeAndName[1].split(" ");
                owner = new Person(names[0], names[1]);
            } else {
                //create Cpmpany
                owner = new Company(typeAndName[1], TypeOfOwnership.gerTypeStringByString(typeAndName[0]));
            }
            return new Account(owner, ownerAndIban[1]); // создаем сам аккаунт
        }
        return null;
    }

    private boolean checkString(String s) {
        return true;
    }
}
