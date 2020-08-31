package lesson2101TaskArrayActionAddCondition;

import lesson2101TaskArrayActionAddCondition.action.Action;

/**
 * JavaAdvanced
 * 18.08.20 21: 42
 */
public class ReverseStringAction2 implements Action {
    @Override
    public String doAction(String str) {
        if(str==null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();

    }
}
