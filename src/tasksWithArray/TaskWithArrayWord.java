package tasksWithArray;

/**
 * JavaAdvanced
 * 03.08.20 20: 53
 */
public class TaskWithArrayWord {
    public static void main(String[] args) {
        int[] array = {12, 2, 3, -2, 17, 3, 9, 1, 3, 4, 5, 6, -5, 28, 6, 2, 3, 4, 1, 1, -9, 11, 5};
        //1) посчитать количество отрицательных элементов;
        //2) считаем количество элементов в слове (ориентируемся на число после отрицательного и количества),
        //например 5. Делаем конструктор в Word. Массив разбираем с конца: длина слова(5), сумма 11.

        Parser parser = new Parser(array);
        System.out.println(parser);
    }


}
