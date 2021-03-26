package homeworkAll.beginnersTasks.TaskBeginner8;

import java.util.Arrays;

public class Task8 {
    //Вернуть массив, смещенный влево на один индекс. То ест для  {6, 2, 5, 3} вернуть {2,5, 3, 6}.
    // Можно вернуть измененный данный массив, а можно вернуть новый.
    public static int[] shiftLeft(int[] nums) {
        if (nums.length == 1) return nums;
        int lastElement = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = lastElement;
        return nums;
    }
}
