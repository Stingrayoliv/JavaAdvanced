package homeworkAll.homework05.figures;

/**
 * JavaAdvanced
 * 06.07.20 21: 23
 */
public class Circle extends Figure {
    public Circle(int radius, String name) {
        super(radius, name);
    }

    @Override
    public void findFigureArea() {
        double area = Math.PI * Math.pow(getRadius(), 2);
        System.out.println("area circle: " + area + " cm");
    }
}
