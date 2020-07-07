package homeworkAll.homework05.figures;

/**
 * JavaAdvanced
 * 06.07.20 21: 26
 */
public class Square extends Figure {
    public Square(String name, int sideSquare) {
        super(name, sideSquare);
    }

    @Override
    public void findFigureArea() {
        double area = Math.pow(getSideSquare(), 2);
        System.out.println("area square: " + area + " cm");
    }
}
