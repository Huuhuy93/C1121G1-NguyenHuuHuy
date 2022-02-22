package furama_resort.models;

public class HouseRental extends Facility {
    private String standardRoom;
    private int floorsAmount;

    public HouseRental() {
    }

    public HouseRental(String idFacility, String serviceName, int useArea, int rentCost,
                       int maxQuantilyPeople, String rentalType) {
        super(idFacility, serviceName, useArea, rentCost, maxQuantilyPeople, rentalType);
    }

    public HouseRental(String idFacility, String serviceName, int useArea, int rentCost,
                       int maxQuantilyPeople, String rentalType, String standardRoom, int floorsAmount) {
        super(idFacility, serviceName, useArea, rentCost, maxQuantilyPeople, rentalType);
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
                "id='" + getIdFacility() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", useArea=" + getUseArea() +
                ", rentCost=" + getRentCost() +
                ", maxQuantilyPeople=" + getMaxQuantilyPeoples() +
                ", rentalType='" + getRentalType() + '\'' +
                "standardRoom='" + getStandardRoom() + '\'' +
                ", quantilyFloor=" + getFloorsAmount() +
                '}';
    }

    @Override
    public String getInfoFacility() {
        return super.getInfoFacility()+","+this.getStandardRoom()+","+this.getFloorsAmount();
    }
}
