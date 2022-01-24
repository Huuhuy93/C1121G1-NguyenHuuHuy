package ss17_io_binary_file_and_serialization.exercise.manager_product_save_to_file.controller;

import ss17_io_binary_file_and_serialization.exercise.manager_product_save_to_file.model.service.ProductsServiceImpl;

import java.util.Scanner;

public class MainMenuProducts {
    public void showMainMenuProducts() {
        ProductsServiceImpl productsService = new ProductsServiceImpl();
        Scanner sc = new Scanner(System.in);
        int chooseMenu;
        boolean flag = true;

        do {
            System.out.println("Nhập chức năng bạn muốn dùng");
            System.out.println("1.\tadd\n" +
                    "2.\tdisplay\n" +
                    "3.\tsearch \n" +
                    "4.\tExit\n");
            chooseMenu = Integer.parseInt(sc.nextLine());

            switch (chooseMenu) {
                case 1:
                    System.out.println("Chức năng add");
                    productsService.add();
                    break;
                case 2:
                    System.out.println("display");
                    productsService.display();
                    break;
                case 3:
                    System.out.println("search");
                    productsService.search();
                    break;
                case 4:
                    flag = false;
            }

        } while (flag);
    }
}
