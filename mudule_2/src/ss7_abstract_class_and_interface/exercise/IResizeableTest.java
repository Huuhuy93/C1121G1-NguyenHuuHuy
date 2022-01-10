package ss7_abstract_class_and_interface.exercise;

public class IResizeableTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 100);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x,"red",false);
        shapes[1] = new Rectangle(x,x,"pink",false);
        shapes[2] = new Square(x,"black",true);


    }
}
