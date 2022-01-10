package ss7_abstract_class_and_interface.exercise.interface_resizeable_for_shape;

import java.util.Random;

public class IResizeableTest {
    public static void main(String[] args) {
        Random random = new Random();
        double data = random.nextDouble() * 10;
        IResizeable shape1 = new Circle(3.3,"red",false);
        IResizeable shape2 = new Rectangle(5,6,"black",true);
        IResizeable shape3 = new Square(5);
        IResizeable[] arrayList = new IResizeable[]{shape1,shape2,shape3};
        System.out.println("Circle pre-resize");
        System.out.println(((Circle) arrayList[0]).getArea());
        System.out.println("Circle after-resize");
        arrayList[0].resize(data);
        System.out.println(((Circle) arrayList[0]).getArea());

        System.out.println("Rectangle pre-resize");
        System.out.println(((Rectangle) arrayList[1]).getArea());
        System.out.println("Rectangle after-resize");
        arrayList[1].resize(data);
        System.out.println(((Rectangle) arrayList[1]).getArea());

        System.out.println("Square pre-resize");
        System.out.println(((Square) arrayList[2]).getArea());
        System.out.println("Square after-resize");
        arrayList[2].resize(data);
        System.out.println(((Square) arrayList[2]).getArea());

    }
}
