package lessonPlant05;

public abstract class Plant {
    private String name;
    private int startGrowth;
    private int growth;

    public Plant(String name, int startGrowth) {
        this.name = name;
        this.startGrowth = startGrowth;
        this.growth = startGrowth;
    }

    public abstract int getSpringGrowth();
    public abstract int getSummerGrowth();
    public abstract int getAutumnGrowth();
    public abstract int getWinterGrowth();


    protected void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getGrowth() {
        return growth;
    }

    public String getName() {
        return name;
    }




    protected void spring() {
        setGrowth(getGrowth() + getSpringGrowth());
        System.out.println("Spring: " +getName() + " plus "+getSpringGrowth()+"cm");
    }

    protected void summer() {
        setGrowth(getGrowth() + getSummerGrowth());
        System.out.println("Summer: " +getName() + " plus "+getSummerGrowth()+"cm");
    }

    protected void autumn() {
        setGrowth(getGrowth() + getAutumnGrowth());
        System.out.println("Autumn: " +getName() + " plus "+getAutumnGrowth()+"cm");
    }

    protected void winter() {
        setGrowth(getGrowth() + getWinterGrowth());
        System.out.println("Winter: " + getName() + " plus "+getSpringGrowth()+"cm");
    }

    public void year() {
        System.out.println();
        System.out.println("stat year " + toString());
        System.out.println("--------------------------------");
        spring();
        summer();
        autumn();
        winter();
        System.out.println("--------------------------------");
        System.out.println("finish year " + toString());

    }
}
