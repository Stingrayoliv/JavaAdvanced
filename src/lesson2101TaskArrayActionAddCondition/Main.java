package lesson2101TaskArrayActionAddCondition;

import lesson2101TaskArrayActionAddCondition.action.ReverseStringAction;
import lesson2101TaskArrayActionAddCondition.condition.LengthCondition;
import lesson2101TaskArrayActionAddCondition.action.ToUpperCaseAction;

/**
 * JavaAdvanced
 * 17.08.20 20: 40
 */
public class Main {
    public static void main(String[] args) {
        String[] strings={"12","qwerty","123456","14",""};
	    /*
        StringArrayHandler stringArrayHandler=
                new StringArrayHandler(strings,
                        new ReverseStringAction(),
                        new LengthMoreThanFourCondition());
        stringArrayHandler.stringsHandle();
        System.out.println(stringArrayHandler.toString());
        */
        StringArrayHandler stringArrayHandler2=
                new StringArrayHandler(strings,
                        new ReverseStringAction(),
                        new LengthCondition(1));
        stringArrayHandler2.stringsHandle();
        System.out.println(stringArrayHandler2.toString());

        StringArrayHandler stringArrayHandler3=
                new StringArrayHandler(strings,
                        new ToUpperCaseAction(),
                        new LengthCondition(1));
        stringArrayHandler3.stringsHandle();
        System.out.println(stringArrayHandler3.toString());

        ActionAndConditionExample actAndCond=new ActionAndConditionExample();
        StringArrayHandler stringArrayHandler5=
                new StringArrayHandler(strings,
                        actAndCond,
                        actAndCond);
        stringArrayHandler5.stringsHandle();
        System.out.println(stringArrayHandler5.toString());
    }


}
