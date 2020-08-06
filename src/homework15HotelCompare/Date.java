package homework15HotelCompare;

public class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public boolean isLeapYear() {
        return isLeapYear(this.year);
    }

    private static boolean checkMonth(int month) {
        return (month >= 1) && (month <= 12);
    }

    public static int getDayPerMonth(int month, int year) {
        if (checkMonth(month)) {
            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (isLeapYear(year) && (month == 2)) {
                return 29;
            } else {
                return days[month];
            }
        } else {
            return 0;
        }
    }

    public int getDayPerMonth() {
        return getDayPerMonth(this.month, this.year);
    }


    public int daysFromNewYear() {
        int rez = 0;
        for (int i = 1; i < this.month; i++) {
            rez += getDayPerMonth(i, this.year);
        }
        rez += this.day;
        return rez;
    }

    public int daysToNewYear() {
        return getDaysPerYear() - this.daysFromNewYear();
    }

    public static int getDaysPerYear(int year) {
        return (isLeapYear(year) ? 366 : 365);
    }

    public int getDaysPerYear() {
        return getDaysPerYear(this.year);
    }

    public static int compareTo(int day, int month, int year, int day1, int month1, int year1) {
        int differenceInYears = year - year1;
        int differenceInMonths = month - month1;
        int differenceInDays = day - day1;
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

    @Override
    public int compareTo(Date date) {
        return compareTo(this.day, this.month, this.year, date.day, date.month, date.year);
    }

}
