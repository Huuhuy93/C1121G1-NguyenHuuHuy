package ss11_java_collection_framework.exercise.product_use_arraylist.model;

public class MobilePhone extends Product {
    private String namePhone;
    private String brand;

    public MobilePhone() {
    }

    public MobilePhone(int id, String nameProduct, int priceProduct) {
        super(id, nameProduct, priceProduct);
    }

    public MobilePhone(int id, String nameProduct, int priceProduct, String namePhone, String brand) {
        super(id, nameProduct, priceProduct);
        this.namePhone = namePhone;
        this.brand = brand;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", namePhone='" + namePhone + '\'' +
                ", brand='" + brand + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }

}
