package ss4_class_and_oop_in_java.exercise.fan;

public class SetFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";
    public SetFan() {
    }

    public SetFan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setisOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void toString(boolean isOn) {
        if (isOn == true) {
            System.out.println("Tốc độ của quạt là :"+this.speed+"-màu sắc của quạt :"+
                    this.color+"-bán kính quạt :"+this.radius+"-fan is on");
        } else {
            System.out.println("Tốc độ của quạt là :"+this.speed+"-màu sắc của quạt :"+
                    this.color+"-bán kính quạt :"+this.radius+"-fan is off");
        }

    }


}
