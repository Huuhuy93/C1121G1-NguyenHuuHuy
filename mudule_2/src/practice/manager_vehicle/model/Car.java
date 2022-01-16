package practice.manager_vehicle.model;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String typeCar;

    public Car() {
    }

    public Car(String licensePlate, String manufacturer, int yearOfManufacture, String owner) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
    }

    public Car(String licensePlate, String manufacturer, int yearOfManufacture, String owner,
               int numberOfSeats, String typeCar) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.typeCar = typeCar;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() + '\'' +
                "numberOfSeats=" + numberOfSeats + '\'' +
                ", typeCar='" + typeCar + '\'' +
                '}';
    }
}
