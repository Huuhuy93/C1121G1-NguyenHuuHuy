package ss6_inherritance.exercise.circle_and_cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.5, "blue");
        System.out.println(circle);
        System.out.println("Area of circle is : "+circle.getArea());
    }
}
