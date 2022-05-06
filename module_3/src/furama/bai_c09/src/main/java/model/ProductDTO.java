package model;

public class ProductDTO {
    Integer idProduct;
    String nameProduct;
    Double price;
    Integer quantity;
    String color;
    String nameCatalogue;

    public ProductDTO() {
    }

    public ProductDTO(String nameProduct, Double price, Integer quantity, String color, String nameCatalogue) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.nameCatalogue = nameCatalogue;
    }

    public ProductDTO(Integer idProduct, String nameProduct, Double price, Integer quantity, String color, String nameCatalogue) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.nameCatalogue = nameCatalogue;
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

    public String getNameCatalogue() {
        return nameCatalogue;
    }

    public void setNameCatalogue(String nameCatalogue) {
        this.nameCatalogue = nameCatalogue;
    }
}
