package practice.manager_vehicle.controller;

import practice.manager_vehicle.model.service.CarServiceImpl;
import practice.manager_vehicle.model.service.MotobikeServiceImpl;
import practice.manager_vehicle.model.service.TruckServiceImpl;

import java.util.Scanner;

public class MainMenuVehicle {
    public void showMainMenuVehicle() {
        Scanner sc = new Scanner(System.in);
        CarServiceImpl carService = new CarServiceImpl();
        MotobikeServiceImpl motobikeService = new MotobikeServiceImpl();
        TruckServiceImpl truckService = new TruckServiceImpl();
        int chooseMenu;
        boolean flag = true;
        do {
            System.out.println("1.\tThêm mới phương tiện.\n" +
                    "2.\tHiện thị phương tiện\n" +
                    "3.\tXóa phương tiện \n" +
                    "4.\tThoát\n");
            System.out.println("Chọn chức năng :");
            chooseMenu = Integer.parseInt(sc.nextLine());
            switch (chooseMenu) {
                case 1: {
                    System.out.println("a.\tThêm mới ô tô.\n" +
                            "b.\tThêm mới xe tải\n" +
                            "c.\tThêm mới xe máy \n");
                    System.out.println("Nhập phương tiện bạn muốn thêm mới");
                    String typeAdd = sc.nextLine();
                    switch (typeAdd) {
                        case "a":
                            System.out.println("Thêm mới ô tô :");
                            carService.add();
                            break;
                        case "b":
                            System.out.println("Thêm mới xe tải");
                            truckService.add();
                            break;
                        case "c":
                            System.out.println("Thêm mới xe máy");
                            motobikeService.add();
                            break;
                    }
                    break;
                }

                case 2: {
                    System.out.println("a.\tHiển thị ô tô\n" +
                            "b.\tHiển thị xe tải\n" +
                            "c.\tHiển thị xe máy \n");
                    String typeDisplay = sc.nextLine();
                    switch (typeDisplay) {
                        case "a":
                            System.out.println("Hiển thị ô tô");
                            carService.display();
                            break;
                        case "b":
                            System.out.println("Hiển thị xe tải");
                            truckService.display();
                            break;
                        case "c":
                            System.out.println("Hiển thị xe máy");
                            motobikeService.display();
                            break;
                    }
                    break;
                }

                case 3: {
                    System.out.println("Bạn có chắc chắn muốn xóa ?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int chooseDelete = Integer.parseInt(sc.nextLine());
                    switch (chooseDelete) {
                        case 1:
                            System.out.println("11. Xóa ô tô");
                            System.out.println("12. Xóa xe máy");
                            System.out.println("13. Xóa xe tải");
                            int chooseType = Integer.parseInt(sc.nextLine());
                            switch (chooseType) {
                                case 11:
                                    carService.delete();
                                    break;
                                case 12:
                                    motobikeService.delete();
                                    break;
                                case 13:
                                    truckService.delete();
                                    break;
                            }
                            showMainMenuVehicle();
                            break;
                        case 2:
                            showMainMenuVehicle();
                    }
                }

                case 4: {
                    System.out.println("Thoát!");
                    flag = false;
                }

            }
        } while (flag);
    }
}
