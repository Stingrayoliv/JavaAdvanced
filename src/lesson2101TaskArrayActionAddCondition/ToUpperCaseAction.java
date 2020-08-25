package lesson2101TaskArrayActionAddCondition;

/**
 * JavaAdvanced
 * 18.08.20 21: 31
 */
public class ToUpperCaseAction implements Action {
    @Override
    public String doAction(String str) {
        if(str==null){
            return null;
        }
        return str.toUpperCase();
    }
}
