package homeworkAll.homework08;
import java.util.Arrays;

/**
 * JavaAdvanced
 * 26.07.20 18: 10
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("David", "Bob", 123);
        Room room1 = new Room(11, Type.VIP, "Twin beds");
        Date start1 = new Date(07, "September", 2020);
        Date end1 = new Date(24, "September", 2020);

        Person person2 = new Person("Olga", "Lobenko", 13);
        Room room2 = new Room(19, Type.SINGLE, "Double bed");
        Date start2 = new Date(31, "May", 2021);
        Date end2 = new Date(06, "Juni", 2021);

        Person person3 = new Person("Sam", "Dovgan", 1983);
        Room room3 = new Room(62, Type.TRIPLE, "Twin beds");
        Date start3 = new Date(01, "December", 2021);
        Date end3 = new Date(24, "December", 2021);

        Booking booking1 = new Booking(person1, room1, start1, end1);
        Booking booking2 = new Booking(person2, room2, start2, end2);
        Booking booking3 = new Booking(person3, room3, start3, end3);

        Booking[] bookings = {booking1, booking2, booking3};
        // the first option for print
        for (Booking booking:bookings) {
            System.out.println(booking.printAll());
        }
        // the second option for print
        //System.out.println(Arrays.toString(bookings));


        }
    }

