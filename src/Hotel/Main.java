package Hotel;

/**
 * JavaAdvanced
 * 31.07.20 19: 46
 */
public class Main {
    public static void main(String[] args) {
        Booking b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Jack"),
                new DateInterval(new Date(30, 7, 2019), new Date(30, 7, 2020))
        );
        Booking b2 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick"),
                new DateInterval(new Date(11, 8, 2020), new Date(13, 8, 2020))
        );
        System.out.println(b1);
        System.out.println(b2);
    }
}
