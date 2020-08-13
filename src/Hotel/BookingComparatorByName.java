package Hotel;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 11.08.20 21: 28
 */
public class BookingComparatorByName implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getPerson().getName().compareTo(o2.getPerson().getName());
    }
}

