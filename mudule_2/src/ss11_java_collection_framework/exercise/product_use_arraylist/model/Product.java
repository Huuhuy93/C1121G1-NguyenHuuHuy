package ss11_java_collection_framework.exercise.product_use_arraylist.model;

public class Product {
    protected int id;
    protected String nameProduct;
    protected int priceProduct;

    public Product() {
    }

    public Product(int id, String nameProduct, int priceProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }

}
