package furama_resort.models;

public class VillaRental extends Facility {
    private String standardRoom;
    private double poolArea;
    private int floorsAmount;

    public VillaRental() {
    }

    public VillaRental(String idFacility, String serviceName, int useArea, int rentCost, int maxQuantilyPeople, String rentalType) {
        super(idFacility, serviceName, useArea, rentCost, maxQuantilyPeople, rentalType);
    }

    public VillaRental(String idFacility, String serviceName, int useArea, int rentCost, int maxQuantilyPeople, String rentalType, String standardRoom, double poolArea, int floorsAmount) {
        super(idFacility, serviceName, useArea, rentCost, maxQuantilyPeople, rentalType);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.floorsAmount = floorsAmount;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorsAmount() {
        return floorsAmount;
    }

    public void setFloorsAmount(int floorsAmount) {
        this.floorsAmount = floorsAmount;
    }

    @Override
    public String toString() {
        return "VillaRental{" +
                "id='" + idFacility + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea + '\'' +
                ", rentCost=" + rentCost + '\'' +
                ", maxQuantilyPeople=" + maxQuantilyPeoples + '\'' +
                ", rentalType='" + rentalType + '\'' +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea + '\'' +
                ", quantilyFloor=" + floorsAmount +
                '}';
    }
}
