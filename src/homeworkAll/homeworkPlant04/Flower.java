package homeworkAll.homeworkPlant04;

/**
 * JavaAdvanced
 * 05.07.20 19: 25
 */
public class Flower extends Plant {

    public Flower(String name, double initialGrowth, double springGrowth, double summerGrowth, double autumnGrowth,
                  double winterGrowth) {
        super(name, initialGrowth, springGrowth, summerGrowth, autumnGrowth, winterGrowth);
    }
//    @Override
//    public void showYearGrowth() {
//        System.out.println( getName()+ "flower growth is " +getInitialGrowth() + showSpringGrowth() + showSummerGrowth() +
//                showAutumnGrowth() + showWinterGrowth() + "cm per year");
//    }
}
