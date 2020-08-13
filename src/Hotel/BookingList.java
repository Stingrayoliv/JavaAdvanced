package Hotel;

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
}
