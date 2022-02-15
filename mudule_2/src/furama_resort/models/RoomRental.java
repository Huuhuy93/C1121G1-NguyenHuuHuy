package furama_resort.models;

public class RoomRental extends Facility {
    private String freeServiceIncluded;

    public RoomRental() {
    }

    public RoomRental(String idFacility, String serviceName, int useArea, int rentCost, int maxQuantilyPeople, String rentalType) {
        super(idFacility, serviceName, useArea, rentCost, maxQuantilyPeople, rentalType);
    }

    public RoomRental(String idFacility, String serviceName, int useArea, int rentCost, int maxQuantilyPeople, String rentalType, String freeServiceIncluded) {
        super(idFacility, serviceName, useArea, rentCost, maxQuantilyPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "RoomRental{" +
                "id='" + idFacility + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea + '\'' +
                ", rentCost=" + rentCost + '\'' +
                ", maxQuantilyPeople=" + maxQuantilyPeoples + '\'' +
                ", rentalType='" + rentalType + '\'' +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}


