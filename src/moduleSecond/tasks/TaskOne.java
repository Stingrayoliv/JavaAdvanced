package moduleSecond.tasks;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskOne {

    //Есть лист целых (Integer) чисел. Известно что каждое число, кроме одного, имеет пару. Найти число без пары.
// {3, 5, 3}->5; {3,5,3,3,3}->5; {3,5,3,5,3}->3
    public static int findNumberWithoutPair(List<Integer> list) {
        if (!list.isEmpty()) {
            Map<Integer, Integer> map = new HashMap<>();
            int count;
            for (Integer integer : list) {
                count = Collections.frequency(list, integer);
                if (count % 2 == 1) {
                    map.put(1, integer);// only 1 number can be without a pair
                }
            }
            return map.get(1);
        } else {
            return 1;
        }
    }
}
