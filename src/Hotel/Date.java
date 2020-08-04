package Hotel;

/**
 * JavaAdvanced
 * 31.07.20 19: 23
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
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

    public static boolean isLeapYear(int year) {//все со словом static относится именно к классу,
        //объекта может еще не быть
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    public boolean isLeapYear() {
        return isLeapYear(this.year);
    }

    private static boolean checkMonth(int month) {
        return (month >= 1) && (month <= 12);
    }

    public static int getDayPerMont(int month, int year) { // вариант с количеством дней по месяцу, с помощью массива
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
        return getDayPerMont(this.month, this.year);
    }

    public int daysFromNewYear() {
        int rez = 0;
        for (int i = 1; i < this.month; i++) {
            rez += getDayPerMont(i, this.year);
        }
        rez += this.day;
        return rez;
    }

    public int daysToNewYear() { // количество дней до НГ
        return getDaysPerYear() - this.daysFromNewYear();
    }

    public static int getDaysPerYear(int year) {
        return (isLeapYear(year) ? 366 : 365);
    }

    public int getDaysPerYear() {// повторяющийся метод, но без статика
        return getDaysPerYear(this.year);
    }


}
