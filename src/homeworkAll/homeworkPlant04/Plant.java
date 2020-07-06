package homeworkAll.homeworkPlant04;

/**
 * JavaAdvanced
 * 05.07.20 19: 32
 */
public abstract class Plant {
    private String name;
    private double initialGrowth; //начальный рост в см
    private double springGrowth;
    private double summerGrowth;
    private double autumnGrowth;
    private double winterGrowth;

    public Plant(String name, double initialGrowth, double springGrowth, double summerGrowth, double autumnGrowth,
                 double winterGrowth) {
        this.name = name;
        this.initialGrowth = initialGrowth;
        this.springGrowth = springGrowth;
        this.summerGrowth = summerGrowth;
        this.autumnGrowth = autumnGrowth;
        this.winterGrowth = winterGrowth;
    }

    public String getName() {
        return name;
    }

    public double getInitialGrowth() {
        return initialGrowth;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", initialGrowth=" + initialGrowth + " cm" + '}';
    }

    public double showSpringGrowth() {
        return springGrowth;
    }

    public double showSummerGrowth() {
        return summerGrowth;
    }

    public double showAutumnGrowth() {
        return autumnGrowth;
    }

    public double showWinterGrowth() {
        return winterGrowth;
    }

    public void showYearGrowth() {
        double result;
        result = initialGrowth + showSpringGrowth() + showSummerGrowth() +
                showAutumnGrowth() + showWinterGrowth();
        System.out.println(name + "plant growth is " + result + "cm per year");
    }


}
