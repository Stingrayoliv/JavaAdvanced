package moduleSecond.tasks.lesson5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task06012020 {
    public static void main(String[] args) {
        Point point = new Point(5, 5);//45 градусов, 0.7853981633974483
        System.out.println(calculateАngle(point));
        Point point1 = new Point(10, 10);//45 градусов, 0.7853981633974483
        System.out.println(calculateАngle(point1));
        Point point2 = new Point(6, 6);//45 градусов, 0.7853981633974483
        System.out.println(calculateАngle(point2));
        Point point3 = new Point(-3, 10);//106.7°
        System.out.println(calculateАngle(point3));
        Point point4 = new Point(-5, -8);//302.0°
        Point point5 = new Point(-3, -3);
        Point point6 = new Point(-4, -4);

        System.out.println(calculateАngle(point4));
        System.out.println("right "+calculateАngle(point3));
        System.out.println(Math.toRadians(106.7));
        //double degs = toDegrees(atan(tangent));


        //System.out.println(Math.toRadians(120));

        System.out.println(findMaxTree(Arrays.asList(point, point1, point2, point3, point4, point5, point6), 30));
    }

    public static int findMaxTree(List<Point> points, int alpha) {
        int max = 0;
        int count = 0;
        double commonLine = Math.toRadians(360 + alpha);
        double cut1 = Math.toRadians(alpha);

        for (double i = cut1; i < commonLine; i += cut1) {
            for (Point point : points) {
                if (calculateАngle(point) <= i && calculateАngle(point) >= (i - cut1)) {
                    count++;
                }
            }
        }

        if (count >= max) {
            max = count;
            count = 0;
        }

        return max;
    }

    public static double calculateАngle(Point point) {
        return Math.pow((point.getY() / point.getX()), -1.0);
    }


    public static double calculateRadians(int greed) {
        return Math.toRadians(greed);
    }


}
