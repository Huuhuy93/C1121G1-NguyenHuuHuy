package ss7_abstract_class_and_interface.exercise.interface_colorable_for_shape;

public class IColorableTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shape[i] = getRandomShape();
        }
        Shape.printShape(shape);
        for (Shape x : shape) {
            if (x instanceof IColorable) {
                ((IColorable) x).howToColor();
            }
        }
    }
    static Shape getRandomShape() {
        int random = (int) (Math.round(Math.random() * 2));
        switch (random) {
            case 0:
                return new Circle(3.5);
            case 1 :
                return new Rectangle(5,10);
            default:
                return new Square(8);
        }
    }
}
