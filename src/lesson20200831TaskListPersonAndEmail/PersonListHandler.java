package lesson20200831TaskListPersonAndEmail;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 31.08.20 21: 46
 */
//public class PersonListHandler {
//    String type="email";
//    public static List<String> personListHandler(List<Person> people, String type) {
//        List<String> list = new ArrayList<>();
//        if (people != null) {
//            for (Person person : people) {
//                List<PersonAddress> tempAddressList = person.getAddresses("email");
//                for (PersonAddress adr : tempAddressList) {
//                    String nameString = person.getFirstName() + ' ' + person.getSecondName();
//                    list.add(new String(adr.getAddress() + ' ' + nameString));
//                }
//            }
//        }
//        return list;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    //    public static List<String> personListHandler(List<Person> people){ // этот метод нужен,
////        // чтобы мы прямо не передавали тип email
////        return personListHandler(people, "email");
////    }
//
//}
