package lesson20200916TasksSetAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Person, String> map;
        map = new HashMap<>();

        Person p1 = new Person("Igor", 20);
        Person p2 = new Person("Lena", 18);
        Person p3 = new Person("Nick", 25);
        map.put(p1, p1.getName());
        map.put(p2, p2.getName());
        map.put(p3, p3.getName()); // ключ у нас сам Person, а значение будет его имя
        System.out.println("p1 hasCode "+p1.hashCode()); // для примера печатаем HashCode
        System.out.println("p2 hasCode "+p2.hashCode());
        System.out.println("p3 hasCode "+p3.hashCode());

        System.out.println(map);

        System.out.println(map.get(p1)); // получаем Value равное персоне 1
        map.remove(p1); // сначала убрали и потом добавили с изменением возраста
        p1.setAge(21); // меняем возраст через set
        System.out.println(map);
        System.out.println("2.------"+map.get(p1)); // получаем Value равное персоне 1 // печатает null потому что
        // hashCode зависит от полей
        System.out.println("p1 hasCode new "+p1.hashCode());

        // the first option how to print HashMap
        for (Map.Entry<Person, String> iEntry : map.entrySet()){
            System.out.println(iEntry.getKey()+iEntry.getValue());
        }
        // the first option how to print HashMap - перебор по ключам
        // Получить keySet() и для каждого ключевого вызова map.get(key)
        final Set<Person> people = map.keySet();
        for (Person person:people){
            System.out.println(person+" "+map.get(person));
        }
        // вариант 3 - синтаксический сахар (от варианта 1)
        map.forEach((key, value)-> System.out.println(key+" "+value));
    }
}
