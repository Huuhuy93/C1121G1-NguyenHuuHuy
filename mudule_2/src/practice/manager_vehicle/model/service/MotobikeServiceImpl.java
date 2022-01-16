package practice.manager_vehicle.model.service;

import practice.manager_vehicle.model.Motobike;

import java.util.ArrayList;
import java.util.Scanner;

public class MotobikeServiceImpl implements IServiceVehicle {

    static ArrayList<Motobike> motobikeList = new ArrayList<>();

    static {
        motobikeList.add(new Motobike("43-K1-678.56","Yamaha",
                2019,"Nguyễn Văn A",100));
        motobikeList.add(new Motobike("43-H1-345.89","Honda",2019,
                "Nguyễn Văn B",150));
        motobikeList.add(new Motobike("43-AK-765.23","Yamaha",2019,
                "Nguyễn Văn C",50));
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

        System.out.println("Công suất");
        int wattage = Integer.parseInt(sc.nextLine());

        Motobike motobike = new Motobike(licensePlate, manufacturer, year, owner, wattage);
        motobikeList.add(motobike);
    }

    @Override
    public void display() {
        for (Motobike temp : motobikeList) {
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
        for (int i = 0; i < motobikeList.size(); i++) {
            if (motobikeList.get(i).getLicensePlate().equals(licensePlateDelete)) {
                motobikeList.remove(i);
                System.out.println("Đã xóa thành công");
            } else {
                break;
            }
        }
    }
}
