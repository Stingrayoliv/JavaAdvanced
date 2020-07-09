package Lesson06;

/**
 * JavaAdvanced
 * 07.07.20 19: 23
 */
public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public String toString() {
        return "Square: side= " + side + " area=" + area();
    }

    public double area() {
        return side * side;
    }
}
