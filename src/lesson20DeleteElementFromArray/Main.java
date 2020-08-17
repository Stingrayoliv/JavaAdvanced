package lesson20DeleteElementFromArray;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 13.08.20 20: 54
 * Удаляем элемент из массива
 */
public class Main {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};
        ArrayHandler arrayHandler = new ArrayHandler(arr);
        System.out.println(Arrays.toString(arrayHandler.getArray()));
        System.out.println("------------------------");
//        arrayHandler.remove();
//        System.out.println(Arrays.toString(arrayHandler.getArray()));
//
//        arrayHandler.remove2(3);// второй метод удаления
//        System.out.println(Arrays.toString(arrayHandler.getArray()));

        arrayHandler.remove3(3);// третий метод удаления
        System.out.println(Arrays.toString(arrayHandler.getArray()));

    }
}
