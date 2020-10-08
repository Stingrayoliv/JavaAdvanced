package homeworkAll.beginnersTasks.TaskBeginner4;

import java.util.Arrays;

public class Task4 {
    //Даны два массива целых чисел. Вернуть true если у них одинаковый первый илипоследний элемент. Оба массива
    // длины 1 или более.commonEnd([1, 2, 3], [7, 3]) → truecommonEnd([1, 2, 3], [7, 3, 2]) →
    // falsecommonEnd([1, 2, 3], [1, 3]) → true
    public static boolean commonEnd(int[] a, int[] b) {
        boolean result = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
