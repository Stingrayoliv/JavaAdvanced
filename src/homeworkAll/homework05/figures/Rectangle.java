package homeworkAll.homework05.figures;

/**
 * JavaAdvanced
 * 06.07.20 21: 27
 */
public class Rectangle extends Figure {
    public Rectangle(String name, int sideA, int sideB) {
        super(name, sideA, sideB);
    }

    @Override
    public void findFigureArea() {
        double area = getSideA() * getSideB();
        System.out.println("area rectangle: " + area + " cm");
    }
}
