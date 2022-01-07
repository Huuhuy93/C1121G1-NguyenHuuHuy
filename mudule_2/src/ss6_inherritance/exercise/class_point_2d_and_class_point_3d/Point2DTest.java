package ss6_inherritance.exercise.class_point_2d_and_class_point_3d;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D p2D = new Point2D();
        p2D.setXY(10, 20);
        System.out.println(Arrays.toString(p2D.getXY()));
        p2D = new Point2D(5,10);
        System.out.println(p2D);
    }
}
