package homeworkAll.homeworkPaint04;
/**
 * JavaAdvanced
 * 06.07.20 17: 09
 */
public abstract class Material {
    private String name;
    private String color;
    private double price;

    public Material(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
// абстрактный метод. Для каждого материала нужно купить доп материалы: например, бумагу.
    public abstract void buyAdditionalMaterials();
}
