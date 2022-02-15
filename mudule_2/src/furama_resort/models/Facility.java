package furama_resort.models;

public abstract class Facility {
    protected String idFacility;
    protected String serviceName;
    protected int useArea;
    protected int rentCost;
    protected int maxQuantilyPeoples;
    protected String rentalType;

    public Facility() {
    }

    public Facility(String idFacility, String serviceName, int useArea, int rentCost, int maxQuantilyPeople, String rentalType) {
        this.idFacility = idFacility;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentCost = rentCost;
        this.maxQuantilyPeoples = maxQuantilyPeople;
        this.rentalType = rentalType;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUseArea() {
        return useArea;
    }

    public void setUseArea(int useArea) {
        this.useArea = useArea;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxQuantilyPeoples() {
        return maxQuantilyPeoples;
    }

    public void setMaxQuantilyPeoples(int maxQuantilyPeoples) {
        this.maxQuantilyPeoples = maxQuantilyPeoples;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "RentalService{" +
                "id='" + idFacility + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea + '\'' +
                ", rentCost=" + rentCost + '\'' +
                ", maxQuantilyPeople=" + maxQuantilyPeoples + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}



