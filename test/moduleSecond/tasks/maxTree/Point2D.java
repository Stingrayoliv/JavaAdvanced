package moduleSecond.tasks.maxTree;

public class Point2D {

    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return angle of the point from [0; 2pi)
     */

    public double getAngleRads() {
        double res = Math.atan2(y, x);
        return res < 0 ? res + 2 * Math.PI:res;
        // если точка в четверти 3, или 4, то пребавляем 2PI
    }
}
