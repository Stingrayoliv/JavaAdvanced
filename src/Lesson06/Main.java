package Lesson06;

/**
 * JavaAdvanced
 * 07.07.20 19: 44
 */
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(10.0);
        Square s1 = new Square(5);
        Square s2 = new Square(10);
        Rectangle r1 = new Rectangle(5, 10);

        System.out.println("---- "+s1.equals(s2)); // по умолчанию сравниваются адрес (если не переопределяем)




        Shape[] shapes = new Shape[]{
                c1, c2, s1, s2, r1,
                new Rectangle(10, 3),
                new Square(18)
        };
        for (Shape shape: shapes) {
            //System.out.println((shape instanceof Circle)); // тут нужна проверка, чтобы понять,
            // что пришло в shape (какая фигура)
            System.out.println(shape.area());
        }
    }

}
