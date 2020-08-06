package lesson16;

/**
 * JavaAdvanced
 * 06.08.20 20: 11
 */
public class Book implements Comparable<Book>{
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.author);
    }

//    @Override
//    public int compareTo(Book book) {
//        return this.author.compareTo(book.author);
//    }
}
