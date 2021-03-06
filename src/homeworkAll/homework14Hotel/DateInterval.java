package homeworkAll.homework14Hotel;

import lesson15.Person;
import sun.jvm.hotspot.utilities.Interval;

import javax.xml.crypto.Data;
import java.util.Random;

/**
 * JavaAdvanced
 * 31.07.20 19: 34
 */
public class DateInterval {
    private Date start;
    private Date finish;
    private static Random rnd = new Random(System.currentTimeMillis());// специальный object для random
    // чтобы разное количество дней generate
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

    public int getDays() { //для расчета цены за все дни бронирования
        if (days == 0) {
            for (int i = start.getYear(); i < finish.getYear(); i++) {
                days += Date.getDaysPerYear(i);
            }
            days -= start.daysFromNewYear();
            days += finish.daysFromNewYear();
        }
//        int min = 1;
//        int max = 100;
//        if (days == 0) {//чтобы если второй раз генерилось, то просто возвращаем уже сгенеренное
//            // ( если 0, то не генерим второй раз)
//            days = min + rnd.nextInt(max - min + 1);
//        }
        return days;
    }


    @Override
    public String toString() {
        return "[" + start + ';' + finish + ']';
    }

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
