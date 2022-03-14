package model;

public class Product {
    private Integer id;
    private String nameProduct;
    private String description;
    private Integer priceProduct;

    public Product() {
    }

    public Product(Integer id, String nameProduct, String description, Integer priceProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.description = description;
        this.priceProduct = priceProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Integer priceProduct) {
        this.priceProduct = priceProduct;
    }
}
