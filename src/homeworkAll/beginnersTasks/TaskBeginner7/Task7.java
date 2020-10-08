package homeworkAll.beginnersTasks.TaskBeginner7;

import java.util.Arrays;

public class Task7 {
    // Вернуть версию входного массива, где каждыое нулевое значение заменено максимальным нечетным значением,
    // справа от нуля. Если нечетных числе справа отнуля нет, то оставляем ноль.
    public static int[] zeroMax(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                int max = 0;
                for (int j = i + 1; j < num.length; j++) {
                    if (num[j] % 2 == 1 && num[j] > max) {
                        max = num[j];
                    }
                }
                if (max != 0) {
                    num[i] = max;
                }
            }
        }
        return num;
    }
}
