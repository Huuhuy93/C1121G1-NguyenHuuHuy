package ss15_handle_exception_and_debug.exercise.illegal_triangle_exception;

public class TriangleCheck {
    private double a;
    private double b;
    private double c;

    public TriangleCheck() {

    }

    public void TriangleCheck(double a, double b, double c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Lỗi : Tam giác này không hợp lệ");
        } else {
            System.out.println("Tam giác này hợp lệ");
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "IllegalTriangleException{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }


}
