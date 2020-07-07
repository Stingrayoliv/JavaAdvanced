package homeworkAll.homework05.figures;

/**
 * JavaAdvanced
 * 06.07.20 21: 35
 */
public class DBMockFigure {
    private static Figure[] figures = {
            new Square ("SquareBig", 30),
            new Square ("SquareSmall", 13),
            new Rectangle("RectangleBig", 40, 50),
            new Rectangle("RectangleSmall", 6, 4),
            new Circle(6, "CircleBig"),
            new Circle(2, "CircleSmall"),
            new Triangle(9, 6, "TriangleBig"),
            new Triangle(5, 3, "TriangleSmall")
    };

    public static Figure[] getFigures() {
        return figures;
    }
}
