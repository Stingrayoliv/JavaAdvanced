package homeworkAll.homeworkBookingAndArrayList;

import java.util.Random;

/**
 * JavaAdvanced
 * 31.07.20 19: 34
 */
public class DateInterval {
    private MyDate start;
    private MyDate finish;
    private static Random rnd = new Random(System.currentTimeMillis());// специальный object для random
    // чтобы разное количество дней генерится
    private int days = 0;

    public DateInterval(MyDate start, MyDate finish) {
        if (start.compareTo(finish) > 0) {// если дата старта больше финиша, то просто их поменять
            this.start = finish;
            this.finish = start;
        } else {
            this.start = start;
            this.finish = finish;
        }
    }

    public static boolean isIntersect(DateInterval interval1, DateInterval interval2) {
        return !((interval1.getStart().compareTo(interval2.getFinish())>0)||
                (interval2.getStart().compareTo(interval1.getFinish())>0));

    }


    public int getDays() { //для расчета цены за все дни бронирования
        if (days == 0) {
            for (int i = start.getYear(); i < finish.getYear(); i++) {
                days += MyDate.getDaysPerYear(i);
            }
            days -= start.daysFromNewYear();
            days += finish.daysFromNewYear();
        }
        //10.10.2016...03.08.2020  - пример для тестов


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


    public MyDate getStart() {
        return start;
    }

    public MyDate getFinish() {
        return finish;
    }
}
