package ss6_inherritance.exercise.class_point_and_moveable_point;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(5, 10);
        System.out.println(Arrays.toString(point.getXY()));
        point = new Point(10, 20);
        System.out.println(point);
    }
}
