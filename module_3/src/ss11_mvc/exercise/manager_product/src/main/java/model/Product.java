package model;

public class Product {
    private Integer id;
    private String name;
    private String detail;
    private Integer price;

    public Product() {
    }

    public Product(Integer id, String name, String detail, Integer price) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
