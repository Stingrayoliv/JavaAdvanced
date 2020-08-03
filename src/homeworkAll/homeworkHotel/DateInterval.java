package homeworkAll.homeworkHotel;

import java.util.Random;


/**
 * JavaAdvanced
 * 02.08.20 14: 04
 */
public class DateInterval {
    private Date start;
    private Date finish;
    //private static Random rnd = new Random(System.currentTimeMillis());
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

    public static boolean checkYear(int year) {
        if (year > 0 && (year % 400 == 0) ^ !(year % 100 == 0) && (year % 4 == 0)) return true;
        return false;
    }

    public static int daysInMonth(int month, int year) {
        //метод, который считает теоретически количество дней в зависимости от месяца
        int tempDay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                tempDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                tempDay = 30;
                break;
            case 2:
                if (checkYear(month) && month == 2) { // вызываем метод из другого класса
                    tempDay = tempDay + 1; // дней будет в феврале 29 так, как год високосный
                } else {
                    tempDay = 28;
                }
                break;
            default:
                tempDay = 0;
                break;
        }

        return tempDay;
    }

    public static int numbersDaysInYear(int year) {
        if (checkYear(year)) return 366;
        else {
            return 365;
        }
    }

    public static int findNumberOfDaysFromNewYear(int day, int month, int year) {
        int temp = 0;
        int commonNumberOfDays = 0;

        for (int i = 1; i <= month; i++) {
            if (month != 1 && month != 12) {
                temp += daysInMonth(i, year);
                commonNumberOfDays = (temp - daysInMonth(month, year)) + day;
            } else if (month == 1) {
                commonNumberOfDays = day;
            } else if (month == 12 & checkYear(year) == true) {
                commonNumberOfDays = (366 - daysInMonth(12, 2020)) + day;
            } else if (month == 12 & checkYear(year) == false) {
                commonNumberOfDays = (365 - daysInMonth(12, 2020)) + day;
            }
        }
        return commonNumberOfDays;
    }


    public int getDays() {
        int sumDays = 0; // количество дней за годы полные годы бронирования
        if (start.getYear() == finish.getYear()) {
            days = findNumberOfDaysFromNewYear(finish.getDay(), finish.getMonth(), finish.getYear()) -
                    findNumberOfDaysFromNewYear(start.getDay(), start.getMonth(), start.getYear());
        } else if (finish.getYear()-start.getYear()  >= 2) { // если разница больше от 2-ч лет
            for (int i = start.getYear() + 1; i < finish.getYear(); i++) {
                sumDays += numbersDaysInYear(i); // количество дней за годы полные годы бронирования
                days = (numbersDaysInYear(start.getYear()) - findNumberOfDaysFromNewYear(start.getDay(), start.getMonth(), start.getYear())) +
                        findNumberOfDaysFromNewYear(finish.getDay(), finish.getMonth(), finish.getYear()) + sumDays;
            }
        } else if (finish.getYear()-start.getYear() < 2) {
            days = (numbersDaysInYear(start.getYear()) - findNumberOfDaysFromNewYear(start.getDay(), start.getMonth(), start.getYear())) +
                    findNumberOfDaysFromNewYear(finish.getDay(), finish.getMonth(), finish.getYear());
        }
        return days;

//        int min = 1;
//        int max = 100;
//        if (days == 0) {
//            days = min + rnd.nextInt(max - min + 1);
//
//        }
    }

    @Override
    public String toString() {
        return "[" + start + ';' + finish + ']';
    }
}
