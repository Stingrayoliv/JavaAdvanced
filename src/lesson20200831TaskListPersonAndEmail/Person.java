package lesson20200831TaskListPersonAndEmail;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * JavaAdvanced
 * 31.08.20 20: 16
 */
//public class Person {
//    private String firstName;
//    private String secondName;
//    private List<PersonAddress> addresses;
//
//    public Person(String firstName, String secondName, List<PersonAddress> addresses) {
//        this.firstName = firstName;
//        this.secondName = secondName;
//        this.addresses = addresses;
//    }
//
//    public Person(String firstName, String secondName) {
//        this.firstName = firstName;
//            this.secondName = secondName;
//
//        первый вариант с эксепшенами
//        if (firstName != null) {
//            this.firstName = firstName;
//            this.secondName = secondName;
//        } else {
//            throw new IllegalArgumentException();
//        }
//         второй вариант
//        this.firstName = Objects.requireNonNull(firstName);
//        this.secondName = secondName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getSecondName() {
//        return secondName;
//    }
//
//    public List<PersonAddress> getAddresses() {// перед тем как отдать, создаем новый лист - копию
//        return new ArrayList<>(addresses); // такой подход нужен, чтобы не было прямого доступа
//    }
//
//    // этот метод возвращает адреса с определенным типом
//    public List<PersonAddress> getAddresses(String type) {
//        List<PersonAddress> res = new ArrayList<>();
//        for (PersonAddress address : addresses) {
//            if (address.getType().equals(type)) {
//                res.add(address);
//            }
//        }
//        return res;
//    }
//
//    public void addAddress(PersonAddress address) {
//        if (addresses != null) {// адрес не пустой
//            if (addresses == null) {
//                addresses = new ArrayList<>(); // создаем новый список - по-умолчанию размер 16 элементов
//            }
//            addresses.add(address);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return firstName + ' ' + secondName + addresses;
//    }
//}
