package homeworkAll.homework08;

/**
 * JavaAdvanced
 * 26.07.20 17: 18
 */
public class Date {
    private int day;
    private String month;
    private int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Date:" + day + "-"+month + "-"+year;
    }
}
