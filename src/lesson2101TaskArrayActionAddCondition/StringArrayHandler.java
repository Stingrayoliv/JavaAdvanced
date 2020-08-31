package lesson2101TaskArrayActionAddCondition;

import lesson2101TaskArrayActionAddCondition.action.Action;
import lesson2101TaskArrayActionAddCondition.condition.Condition;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 17.08.20 20: 54
 */
public class StringArrayHandler {
    private String[] strings;
    private Action action;
    private Condition condition;

    public StringArrayHandler(String[] strings, Action action, Condition condition) {
        this.strings = strings;
        this.action = action;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

    public String[] getStrings() {
        return strings;
    }

    public void stringsHandle() {// вернет StringArrayHandler
        for (int i = 0; i < strings.length; i++) {
            if (condition.test(strings[i])) {
                strings[i] = action.doAction(strings[i]);
            }
        }

    }

//    public StringArrayHandler stringsHandle() {// вернет StringArrayHandler// второй вариант, возвращает StringArrayHandler
//        for (int i = 0; i < strings.length; i++) {
//            if (condition.test(strings[i])) {
//                strings[i] = action.doAction(strings[i]);
//            }
//        }
//        return this; // метод возвращает сам себя
//    }

}
