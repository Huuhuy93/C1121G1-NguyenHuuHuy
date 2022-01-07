package ss6_inherritance.practice.system_object_shape;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.5);
        System.out.println(square);
        square = new Square(2.5, "black", false);
        System.out.println(square);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());

    }
}
