package homeworkAll.tasksStream.streamTask6;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //6. Написать функцию, которая принимает предложение, а возвращает количество слов,
        // начинающихся на заданную букву.
        String text = "Abysmal, Accolade Acclimatize, you, she, he";
        List<String> list = Arrays.asList(text.toLowerCase().split("\\s"));
        System.out.println(list);
        int n= (int) list.stream().filter((s) -> s.startsWith("a")).count();
        System.out.println("Task6: "+n);
    }
}
