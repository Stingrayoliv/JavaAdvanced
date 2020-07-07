package LessonPlant05;

public class Flower extends Plant {
    private int springGrowth = 20;
    private int summerGrowth = 10;
    private int autumnGrowth = 0;
    private int winterGrowth = 0;

    public Flower(String name, int startGrowth) {
        super(name, startGrowth);
    }

    @Override
    protected void winter() {
        setGrowth(0);
        System.out.println("Winter: " + getName() + "is cut "+getGrowth()+"cm");
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
        return "Flower [" + getName() + "] growth: " + getGrowth()+"cm";
    }

}
