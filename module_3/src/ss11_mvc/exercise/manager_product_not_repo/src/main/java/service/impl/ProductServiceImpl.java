package service.impl;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(201, "Dien thoai", "Iphone 13", 1520));
        products.put(2, new Product(203, "Dien thoai", "Iphone 12", 1030));
        products.put(3, new Product(301, "Tivi", "Sony 4k50", 510));
        products.put(4, new Product(302, "Tivi", "Samsung FHD43", 400));
        products.put(5, new Product(404, "Laptop", "Dell XPS15", 930));
        products.put(6, new Product(402, "laptop", "Macbook Pro", 2032));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(Integer id) {
        return products.get(id);
    }

    @Override
    public void update(Integer id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(Integer id) {
        products.remove(id);
    }
}
