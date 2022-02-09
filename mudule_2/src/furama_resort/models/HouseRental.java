package furama_resort.models;

public class HouseRental extends Facility {
    private String standardRoom;
    private int floorsAmount;

    public HouseRental() {
    }

    public HouseRental(String serviceName, int useArea, int rentCost, int maxQuantilyPeople, String rentalType) {
        super(serviceName, useArea, rentCost, maxQuantilyPeople, rentalType);
    }

    public HouseRental(String serviceName, int useArea, int rentCost, int maxQuantilyPeople, String rentalType,
                       String standardRoom, int floorsAmount) {
        super(serviceName, useArea, rentCost, maxQuantilyPeople, rentalType);
        this.standardRoom = standardRoom;
        this.floorsAmount = floorsAmount;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloorsAmount() {
        return floorsAmount;
    }

    public void setFloorsAmount(int floorsAmount) {
        this.floorsAmount = floorsAmount;
    }

    @Override
    public String toString() {
        return "HouseRental{" +
                "serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea +
                ", rentCost=" + rentCost +
                ", maxQuantilyPeople=" + maxQuantilyPeoples +
                ", rentalType='" + rentalType + '\'' +
                "standardRoom='" + standardRoom + '\'' +
                ", quantilyFloor=" + floorsAmount +
                '}';
    }
}
