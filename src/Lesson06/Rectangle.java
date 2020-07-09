package Lesson06;

/**
 * JavaAdvanced
 * 07.07.20 19: 29
 */
public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public String toString() {
        return "Rectangle: sides= " + sideA + sideB + "|" + " area=" + area();
    }

    public double area() {
        return sideA * sideB;
    }
}
