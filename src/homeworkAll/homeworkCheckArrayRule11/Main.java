package homeworkAll.homeworkCheckArrayRule11;
/**
 * JavaAdvanced
 * 31.07.20 13: 01
 */
public class Main {
    // проверить соответствует ли int[] array правилу формирования:
    // сумма значений до отрицательного числа равно значению элемента после отрицательного количества, а количество
    //элементов до отриц. числа - значению второго элемента после него.

    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, 6, 3, 1, 4, 1, 2, 1, -7, 9, 5};//true
        System.out.println("Test №1 "+checkArray(array));
        //int[] array2 = {1, 2, 3, -1, 8, 3, 1, 4, 1, 2, 1, -7, 9, 5};//false
        //System.out.println("Test №2 "+checkArray(array2));
    }

    public static boolean checkArray(int[] array) {
        boolean status = false;
        int sumValue = 0;
        int sumNumber = 0;
        int tempIndex = 0;// для негативного индекса

        for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    tempIndex++; // начинает расти "временный" индекс для негативного числа
                } else {
                    sumValue += array[i];
                    sumNumber = i + 1;// i будет от 0, для подсчета количества нужно добавить 1
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

