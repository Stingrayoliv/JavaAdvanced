package homeworkAll.homeworkPaint04;

/**
 * JavaAdvanced
 * 06.07.20 17: 24
 */
public class Oil extends Paint {
    public Oil(String name, String color, double price) {
        super(name, color, price);
    }

    @Override
    public void buyAdditionalMaterials() {
        System.out.println("You should buy paint thinner and canvas");
    }

    @Override
    public void findLearningOption() {
        System.out.println("you can work with a teacher only in class ");
    }
}
