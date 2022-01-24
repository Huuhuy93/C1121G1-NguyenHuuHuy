package ss17_io_binary_file_and_serialization.exercise.manager_product_save_to_file.model.service;

import ss17_io_binary_file_and_serialization.exercise.manager_product_save_to_file.model.Products;
import ss17_io_binary_file_and_serialization.exercise.manager_product_save_to_file.model.util.ReadAndWriteProducts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsServiceImpl implements IServiceProduct {
    public static Scanner sc = new Scanner(System.in);
    private List<Products> productsList;
    private ReadAndWriteProducts readAndWriteProducts;

    public ProductsServiceImpl() {
        readAndWriteProducts = new ReadAndWriteProducts();
        productsList = readAndWriteProducts.readProduct();
    }

    @Override
    public void add() {
        String maSanPham = inputMaSanPham();
        String tenSanPham = inputTenSanPham();
        String hangSanXuat = inputHangSanXuat();
        int giaSanPham = inputGiaSanPham();
        String moTaKhac = inputMoTaKhac();

        Products products = new Products(maSanPham, tenSanPham, hangSanXuat, giaSanPham, moTaKhac);
        productsList.add(products);
        readAndWriteProducts.writeProduct(productsList);

    }

    @Override
    public void display() {
        for (Products product: productsList) {
            if (product == null) {
                break;
            } else {
                System.out.println(product.toString());
            }
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm cần tìm kiếm ");
        String tenTimKiem = sc.nextLine();
        for (Products product: productsList) {
            if (product.getTenSanPham().equalsIgnoreCase(tenTimKiem)) {
                System.out.println(product);
            } else {
                System.out.println("tên sản phẩm vừa nhập không có trong danh mục");
            }
        }
    }

    private String inputMaSanPham() {
        System.out.println("Nhập mã sản phẩm");
        return sc.nextLine();
    }

    private String inputTenSanPham() {
        System.out.println("Nhập tên sản phẩm");
        return sc.nextLine();
    }

    private String inputHangSanXuat() {
        System.out.println("Nhập hãng sản xuất");
        return sc.nextLine();
    }

    private int inputGiaSanPham() {
        System.out.println("Nhập giá sản phẩm");
        while (true) {
            try {
                int giaSanPham = Integer.parseInt(sc.nextLine());
                if (giaSanPham < 0) {
                    throw new NumberFormatException();
                }
                return giaSanPham;
            } catch (NumberFormatException e) {
                System.out.println("Giá sản phẩm không hợp lệ! vui lòng nhập lại");
            }
        }
    }

    private String inputMoTaKhac() {
        System.out.println("Nhập mô tả khác của sản phẩm");
        return sc.nextLine();
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }
}
