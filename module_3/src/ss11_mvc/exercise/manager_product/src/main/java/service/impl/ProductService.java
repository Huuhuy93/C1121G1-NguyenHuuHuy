package service.impl;

import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        List<Product> productList = iProductRepository.findAll();
        return productList;
    }

    @Override
    public Product findById(Integer id) {
        Product product = this.iProductRepository.findById(id);
        return product;
    }

    @Override
    public void create(Product product) {
        this.iProductRepository.create(product);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void delete(Integer id) {
        this.iProductRepository.delete(id);
    }

    @Override
    public void update(Integer id, String name, String detail, Integer price) {
        this.iProductRepository.update(id, name, detail, price);
    }
}
