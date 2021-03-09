package moduleSecond.tasks;

import java.util.*;

//Есть ряд (List) положительных int чисел, расположенных по возрастанию. Есть число N. Определить, можно ли N разложить
// на произведение двух различных элементов из ряда-листа.
// {1, 5, 8, 20} & 15 -> false; {1, 5, 8, 20} & 40 -> true; {1, 5, 5, 8, 20} & 25 -> true; {1, 5, 8, 20} & 25 -> false;
public class Task2 {
    public static boolean checkCondition(List<Integer> list, int n) {
        Deque<Integer> deque = new ArrayDeque(list);

        while (!deque.isEmpty()) {
            if ((n > 0 && n % deque.pollFirst() == 0 && deque.contains(n / deque.pollFirst()))) {
                return true;
            }
            if ((n > 0 && deque.pollLast() > 0 && n % deque.pollLast() == 0 && deque.contains(n / deque.pollLast()))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkCondition(Arrays.asList(1, 5, 8, 20), 15));
    }
}
