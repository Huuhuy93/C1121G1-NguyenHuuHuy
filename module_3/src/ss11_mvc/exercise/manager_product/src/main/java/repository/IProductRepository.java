package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    Product findById(Integer id);
    void create(Product product);
    void save(Product product);
    void delete(Integer id);
    void update(Integer id, String name, String detail, Integer price);
}
