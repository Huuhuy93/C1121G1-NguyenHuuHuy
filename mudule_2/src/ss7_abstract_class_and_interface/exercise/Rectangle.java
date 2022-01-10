package ss7_abstract_class_and_interface.exercise;


public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double heigh = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double heigh) {
        this.width = width;
        this.heigh = heigh;
    }

    public Rectangle(double width, double heigh, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.heigh = heigh;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double getArea() {
        return heigh * width;
    }

    public double getPerimeter() {
        return (heigh + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle with{" +
                "width=" + width +
                ", heigh=" + heigh +
                '}' +
                ", which is a subclass of " +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() * percent);
        setHeigh(getHeigh() * percent);
    }
}
