package furama_resort.models;

public class Customer extends Person {
    private String customerCode;
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(int id, String fullName, String dateOfBirth, String gender, int identityCardNumber,
                    String phoneNumber, String email) {
        super(id, fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
    }

    public Customer(int id, String fullName, String dateOfBirth, String gender, int identityCardNumber, String phoneNumber,
                    String email, String customerCode, String typeCustomer, String address) {
        super(id, fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
