package lesson2101TaskArrayActionAddCondition.condition;

import lesson2101TaskArrayActionAddCondition.condition.Condition;

/**
 * JavaAdvanced
 * 18.08.20 21: 23
 */
public class LengthCondition implements Condition {
    private int length;

    public LengthCondition(int length) {
        this.length = length;
    }

    @Override
    public boolean test(String str) {
        return str != null && str.length() > length;
    }
}
