package homeworkAll.homeworkHotel;

/**
 * JavaAdvanced
 * 04.08.20 12: 51
 */
public class BookingArray {
    private Booking[] bookings;
    private Booking[] bookingsForAdding; // массив объектов с новыми бронирования, для добавления

    public BookingArray(Booking[] bookings) {
        this.bookings = bookings;
    }

    public Booking[] getBookings() {
        return bookings;
    }

    public static void printAll(Booking[] bookings) {
        for (Booking booking : bookings) {
            System.out.println(booking.toString());
        }
    }
    // метод по добавлению новых бронирований (позволяет добавить сразу несколько бронирований)
    public static void addBookingsInArray(Booking bookings[], Booking[] bookingsForAdding) {
        Booking[] result = new Booking[bookings.length + bookingsForAdding.length];
        System.arraycopy(bookings, 0, result, 0, bookings.length);
        System.arraycopy(bookingsForAdding, 0, result, bookings.length, bookingsForAdding.length);
        printAll(result);
    }


}
