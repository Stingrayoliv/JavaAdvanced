package homeworkAll.homeworkHotel;

import Hotel.Person;
import Hotel.StandardRoom;

/**
 * JavaAdvanced
 * 31.07.20 19: 46
 */
public class Main {
    public static void main(String[] args) {
        Booking[] bookings = DBMock.getBookings();
        Booking[] bookingsForAdding = DBMock.getBookingsForAdding();

        BookingArray bookingArray1 = new BookingArray(bookings);
        BookingArray bookingArray2ForAdding = new BookingArray(bookingsForAdding);


        System.out.println("initial array of bookings");
        BookingArray.printAll(bookings); // для печати начального массива
        System.out.println("array of bookings including new bookings");
        BookingArray.addBookingsInArray(bookings, bookingsForAdding);


        //System.out.println(b1);
        // System.out.println(b2);


        //System.out.println("number of days in year: "+numbersDaysInYear(2019)); // для тестов (всего дней в году)
        //System.out.println(checkYear(2020)); // для проверки года на leap year

        //возвращает количество дней сначала года до даты
        //System.out.println("number of days from New Year: " + findNumberOfDaysFromNewYear(01, 01, 2017));// для тестирования
        //System.out.println("number of days from New Year: " + findNumberOfDaysFromNewYear(10, 02, 2020));// для тестирования


    }

}
