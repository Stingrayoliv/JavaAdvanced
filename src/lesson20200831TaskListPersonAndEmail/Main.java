package lesson20200831TaskListPersonAndEmail;

import lesson21.Address;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 31.08.20 20: 03
 */
//public class Main {
//    public static void main(String[] args) {
//        PersonAddress address = new PersonAddress("adr1", AddressType.EMAIL);// cоздание с помощью енум
//        System.out.println(address.getType());
//        System.out.println(address.getType().equals("POST")); // через ENUM не работает equals
//        System.out.println(address.getType() == AddressType.POST); // с ENUM так работает, потому что сравниваются
//        // одни объекты
//        //System.out.println(address.getType()==AddressType.valueOf("POST"));// valueOf() заточен только на поиск среди
//        //ENUM
//        PersonAddress address1 = null; // не будет создаваться объект, если нет адреса верного. Пример обработки
//        try{
//            address1 = new PersonAddress("adr1", "qwe");
//        } catch (Exception ex){}
//        System.out.println(address1);
//
//        System.out.println("-------------------------------");
//
//        AddressType[] addressTypes = AddressType.values();  // values()  - возвращает массив всех типов ENUM
//        for (int i = 0; i < AddressType.values().length; i++) {
//            System.out.println(addressTypes[i]);
//        }
//        System.out.println("-------------------------------");
//        System.out.println(address.getType().test());// пример того, что в ENUM можно делать списки
//        System.out.println("-------------------------------");
//        System.out.println(address.getType());
//        System.out.println("-------------------------------");
//        address.getType().send();
//
//        Person p1=null;
//        try {
//            p1 = new Person(null, "second1");
//        } catch (Exception e){
//            System.out.println("person not create");
//        }
//        System.out.println(p1);
//        p1.addAddress(new PersonAddress("adr1","post"));
//        p1.addAddress(new PersonAddress("adr2","billing"));
//        p1.addAddress(new PersonAddress("adr3","email"));
//        p1.addAddress(new PersonAddress("adr4","email"));
//
//        Person p2 = new Person("first2", "second2");
//        p2.addAddress(new PersonAddress("2adr1","post"));
//        p2.addAddress(new PersonAddress("2adr2","billing"));
//        p2.addAddress(new PersonAddress("2adr3","email"));
//        p2.addAddress(new PersonAddress("2adr4","email"));
//
//        Person p3 = new Person("first3", "second3");
//        p3.addAddress(new PersonAddress("3adr1","post"));
//        p3.addAddress(new PersonAddress("3adr2","billing"));
//        p3.addAddress(new PersonAddress("3adr3","email"));
//        p3.addAddress(new PersonAddress("3adr4","email"));
//
//        List<Person> people=new ArrayList<>();
//        people.add(p1);
//        people.add(p2);
//        people.add(p3);
//
//        System.out.println(PersonListHandler.personListHandler(people));

//        System.out.println(PersonListHandler.personListHandler(people));
//        PersonListHandler.setType("post");
//    }
//}
