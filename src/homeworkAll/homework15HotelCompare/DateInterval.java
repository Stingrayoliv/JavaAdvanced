package homeworkAll.homework15HotelCompare;

import java.util.Random;

public class DateInterval {
    private Date start;
    private Date finish;
    private static Random rnd = new Random(System.currentTimeMillis());
    private int days = 0;


    public DateInterval(Date start, Date finish) {
        this.start = start;
        this.finish = finish;
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }


    public int getDays() {
     /*
        int min = 1;
        int max = 100;
        if (days == 0) {
            days =min+rnd.nextInt(max-min+1);

        }
        10.10.2016 ....... 03.08.2020

*/
        if (days == 0) {
            for (int i = start.getYear(); i < finish.getYear(); i++) {
                days += Date.getDaysPerYear(i);
            }
            days -= start.daysFromNewYear();
            days += finish.daysFromNewYear();
        }

        return days;
    }

    @Override
    public String toString() {
        return "[" + start + ';' + finish + ']';
    }

    // проверяет, чтобы 2 интервала не совпадали
    public boolean checkingDateInterval(DateInterval dateInterval) {
        if (Date.compareTo(this.start.getDay(), this.start.getMonth(), this.start.getYear(), dateInterval.start.getDay(),
                dateInterval.start.getMonth(), dateInterval.start.getYear()) == 0 &&
                Date.compareTo(this.finish.getDay(), this.finish.getMonth(), this.finish.getYear(), dateInterval.finish.getDay(),
                        dateInterval.finish.getMonth(), dateInterval.finish.getYear()) == 0) {
            return false;
        }
        return true;
    }
}
