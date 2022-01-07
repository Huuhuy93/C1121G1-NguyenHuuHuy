package ss6_inherritance.practice.system_object_shape;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2.2,5);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(2.2, 5, "orange", false);
        System.out.println(rectangle3);

    }
}
