package homeworkAll.homeworkHotel;

/**
 * JavaAdvanced
 * 04.08.20 13: 04
 */
public class DBMock {
    private static Booking[] bookings ={
            new Booking(
                    new StandardRoom("1", 2),
                    new Person("Jack"),
                    new DateInterval(new Date(01, 01, 2019), new Date(10, 2, 2020))),
            new Booking(
                    new SuiteRoom("3", 2),
                    new Person("Nick"),
                    new DateInterval(new Date(11, 8, 2020), new Date(13, 8, 2020))),
    };

    private static Booking[] bookingsForAdding ={
            new Booking(
                    new StandardRoom("5", 2),
                    new Person("Daniel"),
                    new DateInterval(new Date(01, 01, 2020), new Date(10, 2, 2020))),
            new Booking(
                    new SuiteRoom("5", 2),
                    new Person("Michael"),
                    new DateInterval(new Date(11, 8, 2020), new Date(13, 8, 2020))),
    };

    public static Booking[] getBookings() {
        return bookings;
    }

    public static Booking[] getBookingsForAdding() {
        return bookingsForAdding;
    }
}
