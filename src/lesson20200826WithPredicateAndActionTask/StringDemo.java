package lesson20200826WithPredicateAndActionTask;

/**
 * JavaAdvanced
 * 27.08.20 21: 15
 */
public class StringDemo {
    // Сравнение строк
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "hello";
        String s2 = new String("hello");

        System.out.println(s == s1); //true
        System.out.println(s == s2); //false
        System.out.println(s.equals(s1)); //true
        System.out.println(s.equals(s2)); //true

        s = s.toUpperCase();
        s += "q";
        System.out.println(s == s1); // false

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();// плохо работает в многопоточной среде
        // (подходит для однопоточной задачи)
    }
}
