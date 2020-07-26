package lessonPlant05;

public class Bush extends Plant {
    private int springGrowth = 10;
    private int summerGrowth = 10;
    private int autumnGrowth = 3;
    private int winterGrowth = 0;

    public Bush(String name, int startGrowth) {
        super(name, startGrowth);
    }

    @Override
    public int getSpringGrowth() {
        return springGrowth;
    }

    @Override
    public int getSummerGrowth() {
        return summerGrowth;
    }

    @Override
    public int getAutumnGrowth() {
        return autumnGrowth;
    }

    @Override
    public int getWinterGrowth() {
        return winterGrowth;
    }

    @Override
    public String toString() {
        return "Bush [" + getName() + "] growth: " + getGrowth()+"cm";
    }

}