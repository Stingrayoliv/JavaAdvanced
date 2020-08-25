package lesson22LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * JavaAdvanced
 * 20.08.20 19: 57
 */
public class Main {
    public static void main(String[] args) {
//        List<Person>list=new LinkedList<>();// лист это интерфейс, LinkedList - это его реализация
//        list.add(new Person("person 1"));
//        list.add(new Person("person 2"));
//        list.add(new Person("person 3"));
//        System.out.println(list);
//        // или
//        List<Person>list1=new ArrayList<>();// лист это интерфейс, ArrayList<> -под капотом array
//        list1.add(new Person("person 1"));
//        list1.add(new Person("person 2"));
//        list1.add(new Person("person 3"));
//        System.out.println(list1);

        PersonBookingList list = new PersonBookingList();
        list.add(new Person("Person 1"));
        list.add(new Person("Person 2"));
        list.add(new Person("Person 3"));
        System.out.println(list);
        list.remove(); // удали последний элемент
        list.remove();
        list.remove();
        System.out.println(list);
        list.add(new Person("Person 1"));
        list.add(new Person("Person 2"));
        list.add(new Person("Person 3"));

        System.out.println("list before deleting 2" + list);
        Person p = new Person("Person 4");
        System.out.println(list.find(p));
        System.out.println("-------------");
        list.remove(2);
        System.out.println(list);
    }
}
