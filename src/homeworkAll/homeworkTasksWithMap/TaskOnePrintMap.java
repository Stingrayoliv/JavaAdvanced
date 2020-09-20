package homeworkAll.homeworkTasksWithMap;

import java.util.HashMap;
import java.util.Map;

public class TaskOnePrintMap {
    public static void main(String[] args) {
        Map<String, String> example = new HashMap<>();
        example.put("a", "first");
        example.put("b", "second");
        example.put("c", "third");
        example.put("c", "fourth");
        example.put("d", "fifth");

        // the first option how to print HashMap
        for (Map.Entry<String, String> item: example.entrySet()){
            System.out.println(item.getKey()+" "+item.getValue());
        }

//        for(Map.Entry<String, Person> item : people.entrySet()){
//
//            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
//        }

    }
}
