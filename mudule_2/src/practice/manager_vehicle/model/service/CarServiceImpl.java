package practice.manager_vehicle.model.service;

import practice.manager_vehicle.model.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceImpl implements IServiceVehicle {
    static ArrayList<Car> carsList = new ArrayList<>();
    static {
        carsList.add(new Car("43A-212.56","Toyota",2019,
                "Nguyễn Văn A",5,"Du lịch"));
        carsList.add(new Car("43B-453.88","Huyndai",2020,
                "Nguyễn Văn B",45,"Xe  khách"));
        carsList.add(new Car("43B-453.89","Ford",2020,
                "Nguyễn Văn C",16,"Xe  khách"));
    }


    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập biển kiểm soát");
        String licensePlate = sc.nextLine();

        System.out.println("Hãng sản xuất");
        String manufacturer = sc.nextLine();

        System.out.println("Năm sản xuất");
        int year = Integer.parseInt(sc.nextLine());

        System.out.println("Chủ sở hữu");
        String owner = sc.nextLine();

        System.out.println("Số chỗ ngồi");
        int numberSeats = Integer.parseInt(sc.nextLine());

        System.out.println("Kiểu xe");
        String typeCar = sc.nextLine();

        Car cars = new Car(licensePlate,manufacturer,year,owner,numberSeats,typeCar);
        carsList.add(cars);

    }

    @Override
    public void display() {
        for (Car temp: carsList) {
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
        for (int i = 0; i < carsList.size(); i++) {
            if (carsList.get(i).getLicensePlate().equals(licensePlateDelete)) {
                carsList.remove(i);
                System.out.println("Đã xóa thành công");
            } else {
                break;
            }
        }

    }
}
