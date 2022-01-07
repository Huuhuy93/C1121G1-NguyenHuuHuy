package ss6_inherritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double heigh = 5;
    public Cylinder() {
    }
    public Cylinder(double heigh) {
        this.heigh = heigh;
    }
    public Cylinder(double radius, String color, double heigh) {
        super(radius, color);
        this.heigh = heigh;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
    public double getVolume() {
        return super.getArea() * heigh;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "heigh=" + heigh +
                '}' +
                ", which is a subclass of " +
                super.toString();
    }
}
