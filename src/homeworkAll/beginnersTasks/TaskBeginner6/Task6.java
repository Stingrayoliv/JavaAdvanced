package homeworkAll.beginnersTasks.TaskBeginner6;

public class Task6 {
    //Вернуть количество четных чисел в массив целых чисел. Напомню, что оператор% "mod" вычисляет остаток от
    // деления, e.g. 5 % 2 равно 1.countEvens([2, 1, 2, 3, 4]) → 3countEvens([2, 2, 0]) → 3countEvens([1, 3, 5]) → 0
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] != 0) {
                count++;
            }
        }
        return count;
    }
}
