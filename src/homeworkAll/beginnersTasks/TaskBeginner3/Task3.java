package homeworkAll.beginnersTasks.TaskBeginner3;

public class Task3 {
    //Даны три целых числ a b c, вернуть наибольшее.intMax(1, 2, 3) → 3intMax(1, 3, 2) → 3intMax(3, 2, 1) → 3
    public static int intMax(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        return max;
    }
}
