package moduleSecond.tasks.lesson2;

import java.util.*;

public class TaskWithMap {
    // Есть массив int[]. Вывести число, которое встречается чаще всех.
    public static void main(String[] args) {
        int[] array={1, 2, 3, 4, 5 , 3, 5, 5};

        createMap(array);
        System.out.println(Arrays.asList(createMap(array)));
        System.out.println(findMaxNumber(createMap(array)));
    }

    public static Map<Integer, Integer> createMap(int[] array){
        Map<Integer, Integer> map=new HashMap<>();
        for (Integer element : array) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        return map;

    }

    public static int findMaxNumber(Map<Integer, Integer> map) {
        int result = 0;
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                result=entry.getKey();
            }
        }
        return result;
    }
}
