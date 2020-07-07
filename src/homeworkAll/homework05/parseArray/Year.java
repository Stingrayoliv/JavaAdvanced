package homeworkAll.homework05.parseArray;

/**
 * JavaAdvanced
 * 06.07.20 22: 20
 */
public class Year {
    private int spring;
    private int summer;
    private int autumn;
    private int winter;


    public Year(int spring, int summer, int autumn, int winter) {
        this.spring = spring;
        this.summer = summer;
        this.autumn = autumn;
        this.winter = winter;

    }

    @Override
    public String toString() {
        return "Year{" +
                "spring=" + spring +
                ", summer=" + summer +
                ", autumn=" + autumn +
                ", winter=" + winter +
                '}';
    }
}
