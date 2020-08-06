package homeworkAll.homework14Hotel;

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
                new DateInterval(new Date(30, 7, 2019), new Date(30, 7, 2020))
        );
        Booking b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Nick"),
                new DateInterval(new Date(11, 8, 2020), new Date(13, 8, 2020))
        );

        Booking b3 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick1"),
                new DateInterval(new Date(11, 8, 2020), new Date(13, 8, 2020))
        );

        Booking b4 = new Booking(
                new SuiteRoom("4", 2),
                new Person("Nick2"),
                new DateInterval(new Date(11, 8, 2020), new Date(13, 8, 2020))
        );

        BookingList bookingList = new ArrayBookingList(6);
//        bookingList.add(b1);
//        bookingList.add(b2);
//        bookingList.add(b3);
//        bookingList.add(b4);
//        bookingList.add(b1);
//        bookingList.add(b2);
//        bookingList.add(b3);
//        bookingList.add(b4);
//        bookingList.print();

        Booking[] bookings = {b1, b2, b3, b4};
        //System.out.println("booking by index in list"+ArrayBookingList.getBookingByIndex(0, bookings));

        Person p1 = new Person("Nick");
        //System.out.println("элемент массива по параметру"+ArrayBookingList.findRoomBooking(bookings, p1));

        // для тестирования метода по сортировке дат
        Date[] dates = new Date[]{
                new Date(11, 8, 2018), new Date(31, 6, 2005),
                new Date(11, 7, 2020), new Date(11, 8, 2020),
                new Date(17, 8, 2020), new Date(12, 8, 2020),
        };
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));

        // тестирование метода, проверяющего корректность интервала checkingDateInterval

        DateInterval dateInterval1=new DateInterval(new Date(11, 8, 2020),
                new Date(13, 8, 2020));
        DateInterval dateInterval2=new DateInterval(new Date(11, 9, 2020),
                new Date(13, 8, 2020));
        System.out.println("test 1: should be false: "+dateInterval1.checkingDateInterval(dateInterval1));
        System.out.println("test 1: should be true: "+dateInterval1.checkingDateInterval(dateInterval2));




        //System.out.println(ArrayBookingList.getBookingByIndex(0, bookingList));
//        System.out.println(b1);
//        System.out.println(b2);
    }


}
