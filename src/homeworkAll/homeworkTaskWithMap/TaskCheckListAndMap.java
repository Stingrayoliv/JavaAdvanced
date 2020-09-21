package homeworkAll.homeworkTaskWithMap;
import java.util.*;
/**
 * JavaAdvanced
 * 20.09.20 20 12
 */

public class TaskCheckListAndMap {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("v", 4);

        //System.out.println(getMapWithLastElementIsSumOfRepeatedStrings(list1, map1));
    }

    public static Map<String, Integer> getMapWithLastElementIsSumOfRepeatedStrings(List<String> list,
                                                                                      Map<String, Integer> map){
        String lastKey = "";
        int lastValue = 0;
        if (!map.isEmpty() && list!=null) {
            for (String str : list) {
                if (map.containsKey(str)) {
                    lastKey += str;
                    lastValue += map.get(str);
                }
            }
            map.put(lastKey, lastValue);
        }
        return map;
    }
}
