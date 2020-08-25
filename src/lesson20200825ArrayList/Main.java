package lesson20200825ArrayList;

import java.util.*;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 25.08.20 19: 40
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qstr1");
        list.add("qstr2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("qstr6");
        System.out.println(list);

        // если начинается на qstr, то удалить элемент (вариант через for)
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).startsWith("q")) {
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println("---------remove--------");
//        System.out.println(list);

        // если начинается на qstr, то удалить элемент (вариант через foreach)
//        for (String s : list) {
//            if (s.startsWith("q")) {
//                list.remove(s);
//            }
//        }
//        System.out.println("---------removed for each--------");
//        System.out.println(list);

        // еще один вариант с итераторами
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()){// пока есть будущий элемент (hasNext() -показывает есть ли элемент еще
//            if (iterator.next().startsWith("q")){
//                iterator.remove();
//            }
//        }
        // вариант удаления с Predicate
        //Predicate<String> predicate = new ConditionForRemove();//Predicate и нащ интерфейс Condition это одно и тоже
        //list.removeIf(new ConditionForRemove());
//        System.out.println(list);

        // удаление с лямда выражением
        list.removeIf(s -> s.startsWith("q"));//s -> s.startsWith("q") - лямда функция
        System.out.println(list);

//      способ получения из листа массив
        String[] array = list.toArray(new String[list.size()]); //вернет массив из стрингов, тут будут все элементы списка

        //быстрый способ создания листа c помощью Arrays.asList
        List<String> list1 = Arrays.asList("s1", "s2", "s3");
        System.out.println(list1);

        Integer h = 10; // создали объект типа интеджер
        Integer h1 = new Integer(10);
        // создаем лист Integer
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(10);
        list2.add(18);
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();
        list2.add(100);
        list2.add(101);
        list2.add(108);
// метод добавления коллекций 1
        list2.addAll(Arrays.asList(1, 2, 3, 4));
        System.out.println(list2);
// метод добавления коллекций 2
        list2.addAll(list3);
        System.out.println(list2);

    }
}
