package lesson20200914TaskSetPerson;

import java.util.*;

public class Task2Map {
    // список строк -> получить Map,
    public static void main(String[] args) {
        List<String> listOfString2 = new ArrayList<>();
        listOfString2.add("Olga");
        listOfString2.add("Lora");
        listOfString2.add("Vadim");
        listOfString2.add("Olga");
        listOfString2.add("Lora");
        System.out.println(getMapOfString(listOfString2).toString());


        List<Person> personList = Arrays.asList(
                new Person("David"),
                new Person("Olga"),
                new Person("Oleg"),
                new Person("Olga"),
                new Person("Anna"),
                new Person("Lora")
        );
        System.out.println(getMapWithKeyPersonAndValueBoolean(personList));


    }

    //посчитать количество повторов value (имен)
    public static Map<String, Integer> getMapOfString(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        if (list == null) return result;
        for (String string : list) {
            if (result.containsKey(string)) {
//                Integer i=result.get(string); // получили значения Integer, что соответствует ключу map
//                i++;
//                result.put(string, i);
                result.put(string, result.get(string) + 1);
            } else {
                result.put(string, 1); // eсли имя встретили один раз
            }
        }
        return result;
    }

    public static Map<Person, Boolean> getMapWithKeyPersonAndValueBoolean(List<Person> list) {
        Map<Person, Boolean> result = new HashMap<>();
        if (list==null) return result;
        for (Person person:list){
            if (!result.containsKey(person)){
                result.put(person, false);
            }else{
                result.put(person, true);
            }
        }
        return result;
    }
}
