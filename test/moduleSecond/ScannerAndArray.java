package moduleSecond;

import java.util.Arrays;

public class ScannerAndArray {
    public static void main(String[] args) {
        System.out.println(findMinValueInArray(makeArrayWithRandomElements()));
    }

    public static int findRandomElement(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static int[] makeArrayWithRandomElements() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = findRandomElement(40, 60);
        }

        return result;
    }

    public static int findMinValueInArray(int[] array) {
        int[] array1 = makeArrayWithRandomElements();
        System.out.println(Arrays.toString(array1));
        int min = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i + 1] < array1[i]) {
                min = array1[i + 1];
            }
        }
        return min;
    }
}
