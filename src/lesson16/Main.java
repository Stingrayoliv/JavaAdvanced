package lesson16;
import java.util.Arrays;

/**
 * JavaAdvanced
 * 06.08.20 20: 10
 */
public class Main {
    public static void main(String[] args) {
        Book[] books= {new Book("Anna", "The Tin Drum"),
        new Book("Oleg", "Mann"),
        new Book("Schlink", "Book4")};


        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

    }
}
