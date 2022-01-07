package ss6_inherritance.exercise.class_point_2d_and_class_point_3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] arr = {getX(), getY(), getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D with " +
                "z=" + z +
                ", which is a subclass of " +
                super.toString();
    }
}
