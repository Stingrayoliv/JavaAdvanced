package homeworkAll.homeworkBookingAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * JavaAdvanced
 * 31.07.20 19: 46
 */
public class Main {
    public static void main(String[] args) {
        Booking b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Jack"),
                new DateInterval(new MyDate(30, 7, 2019), new MyDate(30, 7, 2020))
        );

        Booking b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Nick"),
                new DateInterval(new MyDate(11, 8, 2020), new MyDate(13, 8, 2020))
        );


        Booking b3 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick1"),
                new DateInterval(new MyDate(11, 8, 2020), new MyDate(13, 8, 2020))
        );

        Booking b4 = new Booking(
                new SuiteRoom("4", 2),
                new Person("Nick2"),
                new DateInterval(new MyDate(11, 8, 2020), new MyDate(13, 8, 2020))
        );
        Booking b5 = new Booking(
                new SuiteRoom("4", 2),
                new Person("Nick26"),
                new DateInterval(new MyDate(11, 8, 2020), new MyDate(13, 8, 2020))
        );

//        BookingList bookingList = new ArrayBookingList(2);
//        bookingList.add(b4);
//        bookingList.add(b2);
//        bookingList.add(b3);
//        bookingList.add(b1);
        //System.out.println(bookingList.findIndexOfObject(b3));
        //System.out.println(bookingList.findIndexOfObject(b5));
//        bookingList.remove(b3);
//        bookingList.print();
        //System.out.println("-----------------------");


//        Booking[] bookings = bookingList.getSortedArray(new BookingComparatorByName());
//        bookingList.print();
//        System.out.println("-----------------------");
//       // перезаписываем нулевой элемент
//        bookings[0]=new Booking(
//                new SuiteRoom("4", 2),
//                new lesson20200832TaskListPersonAndEmail.Main.Person("QWE"),
//                new DateInterval(new MyDate(11, 9, 2020), new MyDate(13, 9, 2020)));
//
//        bookingList.print();
//        System.out.println("-----------------------");
//        System.out.println(Arrays.toString(bookings));


//        System.out.println(b1);
//        System.out.println(b2);
        //-----------------------------------
        ArrayList<Booking> list =  new ArrayList<>();
        BookingList bookingList=new ArrayListBooking(list);
        bookingList.add(b1);
        bookingList.add(b4);
        bookingList.add(b3);
        bookingList.add(b2);
        //System.out.println(list);

        //bookingList.remove(b1);
        bookingList.print();
        System.out.println(bookingList.findIndexOfObject(b2));

        System.out.println(Arrays.toString(bookingList.getSortedArray(new BookingComparatorByName())));


    }
}
