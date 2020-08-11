package homework15HotelCompare;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 09.08.20 20: 06
 */
public class BookingComparatorByRoom implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {// номер комнаты String
        return o1.getRoom().getNumber().compareTo(o2.getRoom().getNumber());
    }

}
