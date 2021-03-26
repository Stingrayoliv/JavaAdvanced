package homeworkAll.beginnersTasks.TaskBeginner5;

public class Task5 {
    //Дан массив целых чисел. Вернуть сумму двух первых элементов массива. Еслидлина массива меньше двух,
    // вернуть сумму всех элементов. Вернуть 0, если длинамассива равна нулю
    public static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            return nums[0] + nums[1];
        }
    }
}
