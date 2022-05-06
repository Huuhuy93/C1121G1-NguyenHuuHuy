package service.impl;

import model.Catalogue;
import model.Product;
import model.ProductDTO;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {
    IProductRepository iProductRepository = new ProductRepository();

    @Override
    public void insertProduct(Product product) throws SQLException {
        iProductRepository.insertProduct(product);
    }

    @Override
    public Product selectProduct(Integer idProduct) {
        return iProductRepository.selectProduct(idProduct);
    }

    @Override
    public List<Product> selectAllProduct() {
        return iProductRepository.selectAllProduct();
    }

    @Override
    public boolean deleteProduct(Integer idProduct) throws SQLException {
        return iProductRepository.deleteProduct(idProduct);
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        return iProductRepository.updateProduct(product);
    }

    @Override
    public List<ProductDTO> selectALLProductWithDTO() {
        return iProductRepository.selectALLProductWithDTO();
    }

    @Override
    public List<Catalogue> getAllCatalogue() {
        return iProductRepository.getAllCatalogue();
    }

    @Override
    public List<ProductDTO> searchByName(String name) {
        return iProductRepository.searchByName(name);
    }

    @Override
    public List<ProductDTO> searchByPrice(Double price) {
        return iProductRepository.searchByPrice(price);
    }
}
