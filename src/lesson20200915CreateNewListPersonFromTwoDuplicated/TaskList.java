package lesson20200915CreateNewListPersonFromTwoDuplicated;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskList {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("Oleg"));
        list1.add(new Person("Lora"));
        list1.add(new Person("Oleg"));
        list1.add(new Person("David"));
        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("Oleg"));
        list2.add(new Person("Lora"));
        list2.add(new Person("Anna"));
        list2.add(new Person("Roma"));
    }

//    public static List<Person> getNewListOfDuplicatedPersons(List<Person> list1, List<Person> list2) {
//        List<Person> result = new ArrayList<>();
//        if (list1 != null && list2 != null) {
//            Set<Person> set1 = new HashSet<>(list1);
//            set1.retainAll(list2);
//            result = new ArrayList<>(set1);
//        }
//        return result;
//    }

    public static List<Person> getNewListOfDuplicatedPersons(List<Person> list1, List<Person> list2) {
        List<Person> result = new ArrayList<>();
        if (list1 != null && list2 != null) {
            Set<Person> set1 = new HashSet<>(list1);
            for (Person p : list2) {
                if (set1.contains(p)) {
                    result.add(p);
                }
            }
        }
        return result;
    }
}
