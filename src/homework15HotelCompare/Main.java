package homework15HotelCompare;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Booking b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Jack"),
                new DateInterval(new Date(30, 7, 2020),
                        new Date(10, 8, 2020))
        );


        Booking b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Nick"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020))
        );


        Booking b3 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick1"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020))
        );

        Booking b4 = new Booking(
                new SuiteRoom("4", 2),
                new Person("Nick2"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020))
        );

        BookingList bookingList = new ArrayBookingList(2);
        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);
        bookingList.add(b4);
        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);
        //bookingList.print();

        // для тестирования метода по сортировке дат
        Date[] dates = new Date[]{
                new Date(11, 8, 2018), new Date(31, 6, 2005),
                new Date(11, 7, 2020), new Date(11, 8, 2020),
                new Date(17, 8, 2020), new Date(12, 8, 2020),
        };
        Arrays.sort(dates);
        System.out.println("sort dates in array " + Arrays.toString(dates));

        // тестирование метода, проверяющего корректность интервала checkingDateInterval

        DateInterval dateInterval1 = new DateInterval(new Date(11, 8, 2020),
                new Date(13, 8, 2020));
        DateInterval dateInterval2 = new DateInterval(new Date(11, 9, 2020),
                new Date(13, 8, 2020));
        System.out.println("test 1: should be false: " + dateInterval1.checkingDateInterval(dateInterval1));
        System.out.println("test 1: should be true: " + dateInterval1.checkingDateInterval(dateInterval2));


    }
}
