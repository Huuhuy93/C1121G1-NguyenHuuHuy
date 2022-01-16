package practice.manager_vehicle.model.service;

import practice.manager_vehicle.model.Motobike;
import practice.manager_vehicle.model.Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckServiceImpl implements IServiceVehicle {

    static ArrayList<Truck> trucksList = new ArrayList<>();

    static {
        trucksList.add(new Truck("43C-012.34","Huyndai",2019,
                "Nguyễn Văn A",3));
        trucksList.add(new Truck("43C-47.678","Dongfeng",2019,
                "Nguyễn Văn A",9));
        trucksList.add(new Truck("43C-45.235","Hino",2021,
                "Nguyễn Văn C",12));
    }

    @Override
    public void add() {
        Scanner sc =new Scanner(System.in);

        System.out.println("Nhập biển kiểm soát");
        String licensePlate = sc.nextLine();

        System.out.println("Hãng sản xuất");
        String manufacturer = sc.nextLine();

        System.out.println("Năm sản xuất");
        int year = Integer.parseInt(sc.nextLine());

        System.out.println("Chủ sở hữu");
        String owner = sc.nextLine();

        System.out.println("Trọng tải");
        int tonnage = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void display() {
        for (Truck temp : trucksList) {
            if (temp == null) {
                break;
            } else {
                System.out.println(temp.toString());
            }
        }
    }

    @Override
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số xe cần xóa");
        String licensePlateDelete = sc.nextLine();
        for (int i = 0; i < trucksList.size(); i++) {
            if (trucksList.get(i).getLicensePlate().equals(licensePlateDelete)) {
                trucksList.remove(i);
                System.out.println("Đã xóa thành công");
            } else {
                break;
            }
        }
    }
}
