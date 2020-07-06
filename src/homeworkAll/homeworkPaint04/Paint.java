package homeworkAll.homeworkPaint04;

/**
 * JavaAdvanced
 * 06.07.20 17: 13
 */
public abstract class Paint extends Material {
    public Paint(String name, String color, double price) {
        super(name, color, price);
    }

    @Override
    public void buyAdditionalMaterials() {
        System.out.println("You should buy paper");
    }

// абстрактный метод только для красок. Необходимо выбрать способ обучения.
    public abstract void findLearningOption();
}
