package ss5_access_modifier_static_method_static_property.exercise.access_modifier;

public class Circle {
    final double PI = 3.14;
    private double radius = 1.0;
    private String color = "red";

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * radius * radius;
    }
    void display() {
        System.out.println(radius+" - "+color+" - "+getArea());
    }
}
