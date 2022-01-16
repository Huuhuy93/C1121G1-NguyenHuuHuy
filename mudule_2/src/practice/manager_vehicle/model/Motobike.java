package practice.manager_vehicle.model;

public class Motobike extends Vehicle {
    private int cubicCentimeter;

    public Motobike() {
    }

    public Motobike(String licensePlate, String manufacturer, int yearOfManufacture, String owner) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
    }

    public Motobike(String licensePlate, String manufacturer, int yearOfManufacture, String owner, int cubicCentimeter) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.cubicCentimeter = cubicCentimeter;
    }

    public int getCubicCentimeter() {
        return cubicCentimeter;
    }

    public void setCubicCentimeter(int cubicCentimeter) {
        this.cubicCentimeter = cubicCentimeter;
    }

    @Override
    public String toString() {
        return "Motobike{" +
                super.toString() + '\'' +
                "cubicCentimeter=" + cubicCentimeter +
                '}';
    }
}
