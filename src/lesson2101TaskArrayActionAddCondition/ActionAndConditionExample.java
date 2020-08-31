package lesson2101TaskArrayActionAddCondition;

import lesson2101TaskArrayActionAddCondition.action.Action;
import lesson2101TaskArrayActionAddCondition.condition.Condition;

/**
 * JavaAdvanced
 * 26.08.20 12: 48
 */
public class ActionAndConditionExample implements Condition, Action {

    @Override
    public String doAction(String str) {
        if(str==null){
            return null;
        }
        return str+"!" ;
    }

    @Override
    public boolean test(String str) {
        return str!=null;
    }
}
