package homeworkAll.homeworkPaint04;

/**
 * JavaAdvanced
 * 06.07.20 17: 25
 */
public class Aquarelle extends Paint {
    public Aquarelle(String name, String color, double price) {
        super(name, color, price);
    }

    @Override
    public void findLearningOption() {
        System.out.println("you can buy video tutorials, or work with a teacher online ");
    }

}
