package repository.impl;

import model.Product;
import repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(201, "Dien thoai", "Iphone 13", 1530));
        productList.add(new Product(203, "Dien thoai", "Iphone 12", 1030));
        productList.add(new Product(301, "Tivi", "Sony 4k50", 510));
        productList.add(new Product(302, "Tivi", "Samsung FHD43", 400));
        productList.add(new Product(404, "Laptop", "Dell XPS15", 930));
        productList.add(new Product(402, "laptop", "Macbook Pro", 2032));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(Integer id) {
        for (Product product: productList) {
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void create(Product product) {
        productList.add(product);
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(Integer id) {
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getId()==id){
                productList.remove(i);
            }
        }
    }

    @Override
    public void update(Integer id, String name, String detail, Integer price) {
        for (Product product: productList) {
            if (product.getId().equals(id)){
                product.setName(name);
                product.setDetail(detail);
                product.setPrice(price);
                break;
            }
        }
    }
}
