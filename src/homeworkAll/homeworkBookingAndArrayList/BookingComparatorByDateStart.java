package homeworkAll.homeworkBookingAndArrayList;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 12.08.20 19: 52
 */
public class BookingComparatorByDateStart implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getDateInterval().getStart()
                .compareTo(o2.getDateInterval().getStart());
    }
}
