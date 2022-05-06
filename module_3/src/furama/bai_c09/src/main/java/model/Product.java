package model;

public class Product {
    Integer idProduct;
    String nameProduct;
    Double price;
    Integer quantity;
    String color;
    Integer idCatalogue;

    public Product() {
    }

    public Product(String nameProduct, Double price, Integer quantity, String color, Integer idCatalogue) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.idCatalogue = idCatalogue;
    }

    public Product(Integer idProduct, String nameProduct, Double price, Integer quantity, String color, Integer idCatalogue) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.idCatalogue = idCatalogue;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getIdCatalogue() {
        return idCatalogue;
    }

    public void setIdCatalogue(Integer idCatalogue) {
        this.idCatalogue = idCatalogue;
    }
}
