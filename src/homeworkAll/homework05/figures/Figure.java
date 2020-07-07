package homeworkAll.homework05.figures;

/**
 * JavaAdvanced
 * 06.07.20 21: 20
 */
public abstract class Figure {
    public String name;
    private int sideA;
    private int sideB;
    private int radius;
    private int sideSquare;
    private int sideATriangle;
    private int sideBTriangle;

    public Figure(String name, int sideSquare) {
        this.name = name;
        this.sideSquare = sideSquare;
    }

    public Figure(String name, int sideA, int sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Figure(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public Figure(int sideATriangle, int sideBTriangle, String name) {
        this.name = name;
        this.sideATriangle = sideATriangle;
        this.sideBTriangle = sideBTriangle;
    }


    public String getName() {
        return name;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getRadius() {
        return radius;
    }

    public int getSideSquare() {
        return sideSquare;
    }

    public int getSideATriangle() {
        return sideATriangle;
    }

    public int getSideBTriangle() {
        return sideBTriangle;
    }

    public abstract void findFigureArea(); // абстрактный метод площадь фигуры
}
