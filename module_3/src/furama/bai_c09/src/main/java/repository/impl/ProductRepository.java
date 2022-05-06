package repository.impl;

import model.Catalogue;
import model.Product;
import model.ProductDTO;
import repository.BaseProductRepository;
import repository.IProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private static final String INSERT_PRODUCT_SQL = "INSERT INTO product (name_product, price, " +
            " quantity, color, id_catalogue) VALUES (?, ?, ?, ?, ?);";

    private static final String SELECT_PRODUCT_BY_ID = "select id_product, name_product, price ,quantity, " +
            " color, id_catalogue from product where id_product =?;";

    private static final String SELECT_ALL_PRODUCT = "select * from product;";


    private static final String SELECT_ALL_CATALOGUE = "select * from catalogue;";


    private static final String SELECT_ALL_PRODUCT_JOIN_CATALOGUE = "select product.id_product, product.name_product, product.price, product.quantity, product.color, catalogue.name_catalogue\n" +
            "from product join catalogue on product.id_catalogue = catalogue.id_catalogue\n" +
            "order by id_product;";

    private static final String DELETE_PRODUCT_SQL = "delete from product where id_product = ?;";
    private static final String UPDATE_PRODUCT_SQL = "update product set name_product = ?,price= ?, " +
            " quantity =?, color =?, id_catalogue =? where id_product = ?;";

    private static final String SELECT_NAME_SQL = "select product.id_product, product.name_product, product.price, product.quantity, product.color, catalogue.name_catalogue \n" +
            "            from product join catalogue on product.id_catalogue = catalogue.id_catalogue\n" +
            "            where name_product like concat(\"%\",?,\"%\");";

    private static final String SELECT_PRICE_SQL = "select product.id_product, product.name_product, product.price, product.quantity, product.color, catalogue.name_catalogue\n" +
            "            from product join catalogue on product.id_catalogue = catalogue.id_catalogue\n" +
            "\t\t\twhere price = ?;";

    private BaseProductRepository baseProductRepository = new BaseProductRepository();
    @Override
    public void insertProduct(Product product) throws SQLException {
        Connection connection = null;
        try {
            connection = baseProductRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL);
            preparedStatement.setString(1, product.getNameProduct());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setInt(5, product.getIdCatalogue());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    @Override
    public Product selectProduct(Integer idProduct) {
        Product product = null;
        Connection connection = null;

        try {
            connection = baseProductRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
            preparedStatement.setInt(1, idProduct);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String nameProduct = resultSet.getString("name_product");
                Double price = resultSet.getDouble("price");
                Integer quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                Integer idCatalogue = resultSet.getInt("id_catalogue");
                product = new Product(idProduct, nameProduct, price, quantity, color, idCatalogue);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return product;
    }

    @Override
    public List<Product> selectAllProduct() {

        List<Product> productList = new ArrayList<>();
        Connection connection = null;

        try {
            connection = baseProductRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer idProduct = resultSet.getInt("id_product");
                String nameProduct = resultSet.getString("name_product");
                Double price = resultSet.getDouble("price");
                Integer quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                Integer idCatalogue = resultSet.getInt("id_catalogue");
                productList.add(new Product(idProduct, nameProduct, price, quantity, color, idCatalogue));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return productList;
    }

    @Override
    public boolean deleteProduct(Integer idProduct) throws SQLException {

        boolean rowDelete = false;
        Connection connection = null;
        try {
            connection = baseProductRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_SQL);
            preparedStatement.setInt(1, idProduct);
            rowDelete = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return rowDelete;
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {

        boolean rowUpdate = false;
        Connection connection = null;
        try {
            connection = baseProductRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT_SQL);
            preparedStatement.setString(1, product.getNameProduct());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setInt(5, product.getIdCatalogue());
            preparedStatement.setInt(6, product.getIdProduct());

            rowUpdate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return rowUpdate;
    }

    @Override
    public List<ProductDTO> selectALLProductWithDTO() {
        List<ProductDTO> productDTOList = new ArrayList<>();
        Connection connection = null;

        try {
            connection = baseProductRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT_JOIN_CATALOGUE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer idProduct = resultSet.getInt("id_product");
                String nameProduct = resultSet.getString("name_product");
                Double price = resultSet.getDouble("price");
                Integer quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String nameCatalogue = resultSet.getString("name_catalogue");

                productDTOList.add(new ProductDTO(idProduct, nameProduct, price, quantity, color, nameCatalogue));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return productDTOList;
    }

    @Override
    public List<Catalogue> getAllCatalogue() {
        List<Catalogue> catalogueList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = baseProductRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CATALOGUE);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Integer idCatalogue = resultSet.getInt("id_catalogue");
                String nameCatalogue = resultSet.getString("name_catalogue");
                Catalogue catalogue = new Catalogue(idCatalogue, nameCatalogue);
                catalogueList.add(catalogue);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return catalogueList;
    }

    @Override
    public List<ProductDTO> searchByName(String name) {

        List<ProductDTO> productDTOList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = baseProductRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_NAME_SQL);
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Integer idProduct = rs.getInt("id_product");
                String nameProduct = rs.getString("name_product");
                Double price = rs.getDouble("price");
                Integer quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String nameCatalogue = rs.getString("name_catalogue");

                productDTOList.add(new ProductDTO(idProduct, nameProduct, price, quantity, color, nameCatalogue));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productDTOList;
    }

    @Override
    public List<ProductDTO> searchByPrice(Double price) {

        List<ProductDTO> productDTOList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = baseProductRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRICE_SQL);
            preparedStatement.setDouble(1,  price);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Integer idProduct = rs.getInt("id_product");
                String nameProduct = rs.getString("name_product");
                Double price1 = rs.getDouble("price");
                Integer quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String nameCatalogue = rs.getString("name_catalogue");

                productDTOList.add(new ProductDTO(idProduct, nameProduct, price1, quantity, color, nameCatalogue));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productDTOList;
    }
}
