package practice.manager_vehicle.controller;

import practice.manager_vehicle.model.service.CarServiceImpl;

import java.util.Scanner;

public class MainMenuVehicle {
    public void showMainMenuVehicle() {
        Scanner sc = new Scanner(System.in);
        CarServiceImpl carService = new CarServiceImpl();
        int chooseMenu;
        boolean flag = true;
        do {
            System.out.println("1.\tThêm mới phương tiện.\n" +
                    "2.\tHiện thị phương tiện\n" +
                    "3.\tXóa phương tiện \n" +
                    "4.\tThoát\n");
            System.out.println("Chọn chức năng :");
            chooseMenu = sc.nextInt();
            switch (chooseMenu) {
                case 1:
                    System.out.println("a.\tThêm mới ô tô.\n" +
                            "b.\tThêm mới xe tải\n" +
                            "c.\tThêm mới xe máy \n");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a":
                            System.out.println("Thêm mới ô tô :");
                            carService.add();
                            break;
                        case "b":
                            System.out.println("Thêm mới xe tải");
                            break;
                        case "c":
                            System.out.println("Thêm mới xe máy");
                            break;
                        default:
                            break;
                    }

                case 2:
                    System.out.println("Hiển thị");
                    carService.display();
                    break;
                case 3:
                    System.out.println("Xóa");
                    carService.delete();
                    break;
                case 4:
                    System.out.println("Thoát!");
                    flag = false;

            }
        } while (flag);
    }
}
