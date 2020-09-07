package homeworkAll.homework15HotelCompare;

import java.util.Comparator;

/**
 * JavaAdvanced
 * 10.08.20 13: 25
 */
public class BookingComparatorByStartDate implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {// сортировка дат по стартовой дате
        int differenceInYears = o1.getDateInterval().getStart().getYear() - o2.getDateInterval().getStart().getYear();
        int differenceInMonths =o1.getDateInterval().getStart().getMonth() -o2.getDateInterval().getStart().getMonth();
        int differenceInDays = o1.getDateInterval().getStart().getDay()-o2.getDateInterval().getStart().getDay();
        int result = 0;
        if (differenceInYears > 0) result = 1;
        if (differenceInYears < 0) result = -1;
        if (differenceInYears == 0 && differenceInMonths == 0 && differenceInDays == 0) {
            result = 0;
        }
        if (differenceInYears == 0) {
            if (differenceInMonths > 0) result = 1;
            if (differenceInMonths < 0) result = -1;
            if (differenceInMonths == 0) {
                if (differenceInDays > 0) result = 1;
                if (differenceInDays < 0) result = -1;
            }
        }
        return result;
    }
}
