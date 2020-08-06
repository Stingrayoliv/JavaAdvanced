package lesson16;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 06.08.20 20: 10
 */
public class Main {
    public static void main(String[] args) {
        Book b1 =new Book("Grass", "The Tin Drum");
        Book b2 =new Book("Death in Venice", "Mann");
        Book b3 =new Book("The Reader", "Schlink");

        Book[] books={b1, b2, b3};

        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

    }
}
