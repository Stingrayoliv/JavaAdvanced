package repeat;

/**
 * JavaAdvanced
 * 26.07.20 10: 03
 */
public class TaskRecursion {
    public static void main(String[] args) {
        //Java-basic-recursion-01-04
//        System.out.println(countX("xxhixx"));//4
//        System.out.println(countX("xhixhix"));//3
//        System.out.println(countX("hi"));//0

        //Java-basic-recursion-01-04
        System.out.println(changePi("xpix"));//"x3.14x"
        System.out.println(changePi("pipi"));//"3.143.14"
        System.out.println(changePi("pip"));//"3.14p"
    }

    //Java-basic-recursion-01-05
    //Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced
    // by "3.14". Получив строку, вычислите рекурсивно (без циклов) новую строку, в которой все появления "pi"
    // были заменены на "3.14".
    public static String changePi(String line) {
        String check = "pi";
        final String PI_VALUE = "3.14";
        if (line.length() < 2) {
            return line;
        }
        if (check.equals(line.substring(0, 2))) { //проверяем два первых символа
            return PI_VALUE + changePi(line.substring(2)); // присоединяем пи к обрезанному массиву вместо первых и дальше проверяем массив без первых двух символов
        }
        return line.substring(0, 1) + changePi(line.substring(1)); //добавляем первый символ, если он не пи
    }

    //Java-basic-recursion-01-04
    //Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
    //Получив строку, вычислите рекурсивно (без циклов) количество строчных символов 'x' в строке.
    public static int countX(String a) {
        if (a.equals("")) return 0;
        if (a.charAt(0) == 'x') return 1 + countX(a.substring(1));
        else return countX(a.substring(1));
    }

}
