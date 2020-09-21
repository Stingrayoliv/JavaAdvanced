package homeworkAll.homeworkTaskWithMap;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JavaAdvanced
 * 21.09.20 10 45
 */

class TaskCheckListAndMapTest {
    @Test
    public void getMapWithLastElementIsSumOfRepeatedStrings_MapWithElementKeyConcatenatedStringAndValueSum() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("v", 4);

        Map<String, Integer> mapResult = new LinkedHashMap<>();
        mapResult.put("a", 1);
        mapResult.put("b", 2);
        mapResult.put("c", 3);
        mapResult.put("v", 4);
        mapResult.put("abc", 6);

        assertEquals(mapResult, TaskCheckListAndMap.getMapWithLastElementIsSumOfRepeatedStrings(list1, map1));
    }

    @Test
    public void getMapWithLastElementIsSumOfRepeatedStrings_ListIsEmpty_theSameMap() {
        List<String> list1 = new ArrayList<>();

        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("v", 4);

        Map<String, Integer> mapResult = map1;
        assertEquals(mapResult, TaskCheckListAndMap.getMapWithLastElementIsSumOfRepeatedStrings(list1, map1));
    }

    @Test
    public void getMapWithLastElementIsSumOfRepeatedStrings_MapIsEmpty_EmptyMap() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        Map<String, Integer> map1 = new LinkedHashMap<>();
        Map<String, Integer> mapResult = new LinkedHashMap<>();
        assertEquals(mapResult, TaskCheckListAndMap.getMapWithLastElementIsSumOfRepeatedStrings(list1, map1));
    }

    @Test
    public void getMapWithLastElementIsSumOfRepeatedStrings_ListIsNull_theSameMap() {
        List<String> list1 = null;

        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("v", 4);

        Map<String, Integer> mapResult = map1;
        assertEquals(mapResult, TaskCheckListAndMap.getMapWithLastElementIsSumOfRepeatedStrings(list1, map1));
    }
}
