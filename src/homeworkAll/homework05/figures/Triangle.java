package homeworkAll.homework05.figures;

/**
 * JavaAdvanced
 * 06.07.20 21: 30
 */
public class Triangle extends Figure {
    public Triangle(int sideATriangle, int sideBTriangle, String name) {
        super(sideATriangle, sideBTriangle, name);
    }

    @Override
    public void findFigureArea() {
        double area = getSideATriangle() * getSideBTriangle() * 1 / 2; //площадь прямоугольного треугольника right triangle
        System.out.println("area right triangle: " + area + " cm");
    }
}
