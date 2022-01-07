package ss6_inherritance.exercise.circle_and_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(6);
        System.out.println(cylinder);
        cylinder = new Cylinder(2.5, "red", 5);
        System.out.println(cylinder);
        System.out.println("volune of cylinder is : "+cylinder.getVolume());
    }
}
