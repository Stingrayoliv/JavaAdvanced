package trianhleTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class taskRepeat {
    public static void main(String[] args) {
        Contact contact1 = new Contact(1, "Lora1", "LastName1", 20);
        Contact contact2 = new Contact(2, "Lora2", "LastName2", 21);
        Contact contact3 = new Contact(3, "Lora3", "LastName3", 23);
        Contact contact4 = new Contact(0, "Lora3", "LastName3", 23);

        Map<Integer, Contact> map = new HashMap<>();
        map.put(contact2.getId(), contact2);
        map.put(contact1.getId(), contact1);
        map.put(contact3.getId(), contact3);

//        Map<Integer, Contact> expected = new HashMap<>();
//        expected.put(4, new Contact(4, "Lora3", "LastName3", 23));

        save(new Contact(0, "Lora4", "LastName4", 28));
        System.out.println(find(2));

    }

    public static void save(Contact contact) {
        Map<Integer, Contact> source = new HashMap<>();
        Contact contact1 = new Contact(1, "Lora1", "LastName1", 20);
        Contact contact2 = new Contact(2, "Lora2", "LastName2", 21);
        Contact contact3 = new Contact(3, "Lora3", "LastName3", 23);
        Contact contact4 = new Contact(0, "Lora3", "LastName3", 23);

        source.put(contact2.getId(), contact2);
        source.put(contact1.getId(), contact1);
        source.put(contact3.getId(), contact3);


        List<Integer> sortedId=new ArrayList<>();
        sortedId = source.keySet().stream().sorted().collect(Collectors.toList());
        System.out.println(sortedId);
        int lastId = sortedId.get(sortedId.size()-1);
        System.out.println(lastId);

        if (contact.getId() == 0) {
            contact.setId(lastId + 1);

            source.put(lastId + 1, contact);
            System.out.println(source);
        } else {
            source.put(contact.getId(), contact);
        }
    }

    public static Contact find(int id) {
        Map<Integer, Contact> source = new HashMap<>();
        if (!source.containsKey(id)) {
            return null;
        } else {
            return source.get(id);
        }
    }
}
