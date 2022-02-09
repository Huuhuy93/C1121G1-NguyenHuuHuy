package furama_resort.models;

public class VillaRental extends Facility {
    private String standardRoom;
    private int poolArea;
    private int floorsAmount;

    public VillaRental() {
    }

    public VillaRental(String serviceName, int useArea, int rentCost, int maxQuantilyPeople, String rentalType) {
        super(serviceName, useArea, rentCost, maxQuantilyPeople, rentalType);
    }

    public VillaRental(String serviceName, int useArea, int rentCost, int maxQuantilyPeople, String rentalType,
                       String standardRoom, int poolArea, int floorsAmount) {
        super(serviceName, useArea, rentCost, maxQuantilyPeople, rentalType);
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

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
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
                "serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea +
                ", rentCost=" + rentCost +
                ", maxQuantilyPeople=" + maxQuantilyPeoples +
                ", rentalType='" + rentalType + '\'' +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", quantilyFloor=" + floorsAmount +
                '}';
    }
}
