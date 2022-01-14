package ss11_java_collection_framework.exercise.product_use_arraylist.controller;

import ss11_java_collection_framework.exercise.product_use_arraylist.model.service.MobilephoneServiceImpl;

import java.util.Scanner;

public class MainMenuProduct {
    public void showMainMenuProduct() {
        MobilephoneServiceImpl mobilephoneService = new MobilephoneServiceImpl();
        Scanner sc = new Scanner(System.in);
        int chooseMenu;
        boolean flag = true;
        do {
            System.out.println("1.\tadd\n" +
                    "2.\tdisplay\n" +
                    "3.\tedit \n" +
                    "4.\tdelete\n" +
                    "5.\tsearch\n" +
                    "6.\tExit\n");
            chooseMenu = sc.nextInt();
            switch (chooseMenu) {
                case 1:
                    // gọi method
                    System.out.println("Chức năng add");
                    mobilephoneService.add();
                    break;
                case 2:
                    System.out.println("display");
                    mobilephoneService.display();
                    break;
                case 3:
                    System.out.println("edit");
                    mobilephoneService.edit();
                    break;
                case 4:
                    System.out.println("delete");
                    mobilephoneService.delete();
                    break;
                case 5:
                    System.out.println("search");
                    mobilephoneService.search();
                case 6:
                    flag = false;
            }
        } while (flag);

    }
}
