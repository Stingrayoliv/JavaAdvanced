import java.util.*;
// как тестировать задачу из урока 14.05.2020

public class Task {
    public static void main(String[] args) {
        // первый вариант тестов
        List<String> list1 = Arrays.asList("Q", "w", "e", "w");
        List<String> list2 = Arrays.asList("Q", "w", "e", "w");
        System.out.println(list1.equals(list2));
        Set<String> hashSet1 = new HashSet<>(list1);
        Set<String> hashSet2 = new HashSet<>(list2); // set не подходит для тестов/ не проверит убрали ли дубликаты
        // как вариант добавить еще условие дополнительное для проверки размера
        System.out.println(hashSet1.equals(hashSet2) && (list1.size() == list2.size()));
        // второй вариант через Map Map<String, Integer>

        Map<String, Integer> map = new HashMap<>();
        for (String st : list1) { // проходим по листу и для каждого значения пытаеся добыть значения по ключу, если его нет, то получим null
            Integer i = map.get(st);
            if (i == null) { // значит такой буквы не было и значения добавим 1
                map.put(st, 1);
            } else { // если что-то получаем значение i на 1
                map.put(st, ++i); //то увеличим на 1
            }
        }
        System.out.println(map);
// делаем второй проход с  list2, но движение на вычитание --i// при правильном тесте мы должны получить пустой Map
        for (String st : list2) { // проходим по листу и для каждого значения пытаеся добыть значения по ключу, если null
            Integer i = map.get(st);
            if (i == null) { //значит это новая строчка и они не равны
                System.out.println("не равны");
            } else { // если что-то получаем значение i на 1
                i--; // если i после уменьшения 0
                if (i.equals(0)) {
                    map.remove(st); // в конце если тест прошел, то мы должны получить пустой map
                } else {
                    map.put(st, i);
                }
            }
        }
        System.out.println(map);

        // Задача по домашке: Получить Map<String, Boolean> изначально есть стринг. Если ключ уже есть то
        // мы добавляем true

        Map<String, Boolean> map3 = new HashMap<>();
        for (String st : list1) { // проходим по листу и для каждого значения пытаеся добыть значения по ключу, если его нет, то получим null
            if (map3.containsKey(st)) { // если ли такой ключик, то это дубликат
                map3.put(st, true);
            } else { // если ключа не было
                map3.put(st, false);
            }
        }
        System.out.println(map3);
    }
}


