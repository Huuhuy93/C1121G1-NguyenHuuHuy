package ss17_io_binary_file_and_serialization.exercise.manager_product_save_to_file.model.util;

import ss17_io_binary_file_and_serialization.exercise.manager_product_save_to_file.model.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteProducts {
    private static final String PRODUCT_FILE_NAME = "src/ss17_io_binary_file_and_serialization" +
            "/exercise/manager_product_save_to_file/model/data/product.txt";

    public void writeProduct(List<Products> productsList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(PRODUCT_FILE_NAME));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productsList);
            fileOutputStream.close();
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Products> readProduct() {
        List<Products> productsList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(PRODUCT_FILE_NAME));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productsList = (List<Products>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return productsList;
    }
}
