package homework15HotelCompare;

public class ArrayBookingList implements BookingList{
    private Booking[] bookings;
    private int size=0;
    private int capacity=3;

    public ArrayBookingList(Booking[] bookings) {
        this.bookings = bookings;
    }

    public ArrayBookingList(int capacity) {
        this.capacity = capacity;
        bookings = new Booking[this.capacity];
    }


    @Override
    public void add(Booking booking) {
        if(size<capacity){
            bookings[size++]=booking;
        } else {
            capacity*=2;
            Booking[] temp = new Booking[capacity];
            for(int i=0;i<bookings.length;i++){
                temp[i]= bookings[i];
            }
            bookings = temp;
            bookings[size++]=booking;
        }
    }

    @Override
    public int size() {
        return size;
    }

    public Booking[] getBookings() {
        return bookings;
    }

    @Override
    public void print() {
        for (int i=0;i<size;i++){
            System.out.println(bookings[i]);
        }
    }
}
