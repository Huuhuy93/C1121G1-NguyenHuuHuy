package ss7_abstract_class_and_interface.exercise.interface_resizeable_for_shape;

import ss7_abstract_class_and_interface.exercise.interface_resizeable_for_shape.IResizeable;
import ss7_abstract_class_and_interface.exercise.interface_resizeable_for_shape.Shape;

public class Square extends Shape implements IResizeable {
    private double side;
    public Square(){
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                +  getSide()
                + ", which is a subclass of "
                + super.toString()
                + " ,Area = " +
                +getArea();
    }
    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() * percent);
    }
}
