package lesson2101TaskArrayActionAddCondition.condition;

import lesson2101TaskArrayActionAddCondition.condition.Condition;

/**
 * JavaAdvanced
 * 18.08.20 20: 25
 */
public class LengthMoreThanFourCondition implements Condition {
    @Override
    public boolean test(String str) {
        return (str != null && str.length() > 4);// первая на ноль обязательна и должна стоять вначале
        // выполняется все по порядку
    }
}
