package ss6_inherritance.practice.system_object_shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.0);
        System.out.println(circle);
        circle = new Circle(3.5, "blue", false);
        System.out.println(circle);
    }
}
