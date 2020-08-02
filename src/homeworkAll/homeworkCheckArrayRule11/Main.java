package homeworkWord11;

/**
 * JavaAdvanced
 * 31.07.20 13: 01
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, 6, 3, 1, 4, 1, 2, 1, -7, 9, 5};
        System.out.println(checkArray(array));
    }

    public static boolean checkArray(int[] array) {
        boolean status = false;
        int sumValue = 0;
        int sumNumber = 0;
        int indexNegativ = 0;
        int tempIndex = 0;

        for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    //indexNegativ += 1;
                    tempIndex++;
                } else {
                    sumValue += array[i];
                    sumNumber = i + 1;
                }
                if (tempIndex == 1 && sumValue == array[i +1] && sumNumber == array[i+2]) {
                    status = true;
                    sumNumber = 0;
                    sumValue = 0;
                }
        }
        return status;
    }
}

