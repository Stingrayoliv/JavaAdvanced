package homeworkAll.homeworkPaint04;

/**
 * JavaAdvanced
 * 06.07.20 17: 13
 */
public abstract class Pencil extends Material {
    public Pencil(String name, String color, double price) {
        super(name, color, price);
    }

    @Override
    public void buyAdditionalMaterials() {
        System.out.println("You should buy a drawing paper");
    }
}
