package practice.manager_vehicle.model;

public class Motobike extends Vehicle {
    private int cubicCentimeters;

    public Motobike() {
    }

    public Motobike(String licensePlate, String manufacturer, int yearOfManufacture, String owner) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
    }

    public Motobike(String licensePlate, String manufacturer, int yearOfManufacture, String owner, int cubicCentimeter) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.cubicCentimeters = cubicCentimeter;
    }

    public int getCubicCentimeters() {
        return cubicCentimeters;
    }

    public void setCubicCentimeters(int cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    @Override
    public String toString() {
        return "Motobike{" +
                super.toString() + '\'' +
                "cubicCentimeter=" + cubicCentimeters +
                '}';
    }
}
