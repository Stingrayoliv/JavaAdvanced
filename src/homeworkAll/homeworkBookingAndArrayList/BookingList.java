package homeworkAll.homeworkBookingAndArrayList;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 04.08.20 21: 19
 */
public interface BookingList {
    void add(Booking booking);
    int size();
    void  print();

    Booking[] getSortedArray(Comparator<Booking> comparator);

    Booking getByIndex(int i);

    int findIndexOfObject(Booking booking);

    Booking[] remove(Booking booking);
}
