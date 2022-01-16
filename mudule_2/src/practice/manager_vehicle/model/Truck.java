package practice.manager_vehicle.model;

public class Truck extends Vehicle {
    private int tonnage;

    public Truck() {
    }

    public Truck(String licensePlate, String manufacturer, int yearOfManufacture, String owner) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
    }

    public Truck(String licensePlate, String manufacturer, int yearOfManufacture, String owner, int tonnage) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() + '\'' +
                "tonnage=" + tonnage +
                '}';
    }
}
