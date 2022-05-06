package repository;

import model.Catalogue;
import model.Product;
import model.ProductDTO;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {

    public void insertProduct(Product product) throws SQLException;

    public Product selectProduct(Integer idProduct);

    public List<Product> selectAllProduct();

    public boolean deleteProduct(Integer idProduct) throws SQLException;

    public boolean updateProduct(Product product) throws SQLException;

    public List<ProductDTO> selectALLProductWithDTO();

    public List<Catalogue> getAllCatalogue();

    public List<ProductDTO> searchByName(String name);

    public List<ProductDTO> searchByPrice(Double price);

}
