package Lesson06;

/**
 * JavaAdvanced
 * 07.07.20 19: 33
 */
public class Circle extends Shape {
    private double radius;
    private double area; //immutable method

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius; //immutable method вызываем в конструкторе
    }

    @Override
    public boolean equals(Object o) { //Object o - это object того же класса
        Circle circle = (Circle) o; // Circle circle - это object, который хотим сравнить
        return circle.radius == this.radius; // равные те object, у которых одинаковые радиусы
    }

    public String toString() {
        return "Circle: radius= " + radius + "|" + " area=" + area();
    }

    @Override
    public double area() {
        return area;
    }
}
