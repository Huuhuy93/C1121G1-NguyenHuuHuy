package ss17_io_binary_file_and_serialization.exercise.manager_product_save_to_file.view;

import ss17_io_binary_file_and_serialization.exercise.manager_product_save_to_file.controller.MainMenuProducts;

public class ViewMainMenu {
    public static void main(String[] args) {
        MainMenuProducts mainMenuProducts = new MainMenuProducts();
        mainMenuProducts.showMainMenuProducts();
        System.out.println(mainMenuProducts);
    }
}
