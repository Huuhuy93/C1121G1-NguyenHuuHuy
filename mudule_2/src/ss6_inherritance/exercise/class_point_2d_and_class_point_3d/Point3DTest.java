package ss6_inherritance.exercise.class_point_2d_and_class_point_3d;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D p3D = new Point3D();
        p3D.setXYZ(5,10,15);
        System.out.println(Arrays.toString(p3D.getXYZ()));
        p3D = new Point3D(10, 20, 30);
        System.out.println(p3D);
    }
}
