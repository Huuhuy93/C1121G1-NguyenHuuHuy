package ss11_java_collection_framework.exercise.product_use_arraylist.model;

public class Television extends Product {
    private String nameClass;
    private String brand;
    private int sizeProduct;

    public Television() {
    }

    public Television(int id, String nameProduct, int priceProduct) {
        super(id, nameProduct, priceProduct);
    }

    public Television(int id, String nameProduct, int priceProduct, String nameClass, String brand, int sizeProduct) {
        super(id, nameProduct, priceProduct);
        this.nameClass = nameClass;
        this.brand = brand;
        this.sizeProduct = sizeProduct;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSizeProduct() {
        return sizeProduct;
    }

    public void setSizeProduct(int sizeProduct) {
        this.sizeProduct = sizeProduct;
    }

    @Override
    public String toString() {
        return "Television{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", nameClass='" + nameClass + '\'' +
                ", brand='" + brand + '\'' +
                ", sizeProduct=" + sizeProduct +
                '}';
    }
}
