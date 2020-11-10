package moduleSecond.lesson29112020ReadingSCVFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //variant 1
        // самый популярный метод в Java 8
        //Files.lines(Paths.get("test.txt")).forEach(System.out::println);

        // variant 2 если BufferedReader добавляем в try(), то не нужно делать close
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            br.lines().forEach(System.out::println);
//            String line = null;
//            while ((line= br.readLine()) !=null){
//                System.out.println(line);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
