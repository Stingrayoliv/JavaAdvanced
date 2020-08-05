package homeworkAll.homework14Hotel;

/**
 * JavaAdvanced
 * 04.08.20 21: 25
 */
public class ArrayBookingList implements BookingList {
    private Booking[] bookings;
    private int size = 0;
    private int capacity = 3;

    public ArrayBookingList(int capacity) {
        this.capacity = capacity;
        bookings = new Booking[this.capacity];
    }

    public static Booking getBookingByIndex(int index, Booking[] bookings) {
        Booking b = bookings[index];
        return b;
    }

    public static Booking[] findRoomBooking(Booking[] bookings, Person person) {
        int count = 0;
        Booking[] result = new Booking[count];
        for (int i = 0; i <bookings.length ; i++) {
//            System.out.println(person);
            if (person.toString().equals(bookings[i].getPerson())){
                System.out.println(bookings[i].getPerson());
                bookings[i] = bookings[i];
                count++;
            }
        }
         return result;
    }
    //Booking find(Booking booking);

    @Override
    public void add(Booking booking) { // написан так, что позволяет добавлять по одному большое количество
        if (size < capacity) {
            bookings[size++] = booking; // если массив расширился, то увеличить size
        } else {
            capacity = capacity * 2;
            Booking[] temp = new Booking[capacity];
            for (int i = 0; i < bookings.length; i++) {
                temp[i] = bookings[i];
            }
            bookings = temp;
            bookings[size++] = booking;
        }
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(bookings[i]);
        }
    }


}
