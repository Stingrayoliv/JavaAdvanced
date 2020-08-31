package homeworkAll.homeworkBookingAndArrayList;

import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 26.08.20 00: 01
 */
public class ConditionForRemove implements Predicate<Booking> {
    @Override
    public boolean test(Booking booking) {
        return false;
    }
}
