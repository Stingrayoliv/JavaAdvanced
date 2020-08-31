package homeworkAll.homeworkBookingAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 25.08.20 22: 53
 */
public class ArrayListBooking implements BookingList {
    private ArrayList<Booking> list;

    public ArrayListBooking(ArrayList<Booking> list) {
        this.list = list;
    }

    @Override
    public void add(Booking booking) {
        list.add(booking);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void print() {
        for (Booking b : list) {
            System.out.println(b.toString());
        }
    }

    @Override
    public Booking[] getSortedArray(Comparator<Booking> comparator) {
        Booking[] bookings = list.toArray(new Booking[list.size()]);
        Booking[] res = Arrays.copyOf(bookings, bookings.length);// создает новый массив
        Arrays.sort(res, comparator);
        return res;
    }

    @Override
    public Booking getByIndex(int i) {
        if (i < 0 || i > list.size() - 1) {
            return null;
        } else {
            return list.get(i);
        }
    }

    @Override
    public int findIndexOfObject(Booking booking) {
        for (int i = 0; i < list.size(); i++) {
            if (booking.equals(list.get(i)))
                return i;
        }
        return -1;
    }

    @Override
    public Booking[] remove(Booking booking) {
        list.remove(booking);
////        Predicate<Booking> predicate = new ConditionForRemove();
//        list.removeIf(predicate);
        return list.toArray(new Booking[list.size()]);
    }
}
