package moduleSecond.tasks;

import java.util.*;

public class TaskOne {

    //Есть лист целых (Integer) чисел. Известно что каждое число, кроме одного, имеет пару. Найти число без пары.
    //{3, 5, 3}->5; {3,5,3,3,3}->5; {3,5,3,5,3}->3
    public static int findNumberWithoutPair(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        if (!list.isEmpty()) {
            int count;
            for (Integer integer : list) {
                count = Collections.frequency(list, integer);
                map.put(integer, count);
            }
        }
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (item.getValue() % 2 != 0) {
                result = item.getKey();
            }
        }
        return result;
    }
}
