package furama_resort.models;

public class Customer extends Person {
    private static int customerCode; //tự động tăng Customer theo id.
    private String typeCustomer;
    private String address;
    private int customerId;

    public Customer() {
        this.customerId = this.customerCode++ +1; //Bắt đầu từ 1.
    }

    public Customer(String typeCustomer, String address) {
        this.customerId = this.customerCode++ +1;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(String fullName, String dateOfBirth, String gender, int identityCardNumber, String phoneNumber,
                    String email, String typeCustomer, String address) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.customerId = this.customerCode++ +1;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public static int getCustomerCode() {
        return customerCode;
    }

    public static void setCustomerCode(int customerCode) {
        Customer.customerCode = customerCode;
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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + customerId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        return this.customerId+","+ super.getInfo()+","+this.typeCustomer+","+this.address;
    }
}
