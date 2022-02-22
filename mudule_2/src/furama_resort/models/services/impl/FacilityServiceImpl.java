package furama_resort.models.services;

import furama_resort.models.Facility;
import furama_resort.models.HouseRental;
import furama_resort.models.RoomRental;
import furama_resort.models.VillaRental;
import javafx.scene.transform.Scale;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService{
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element: facilityIntegerMap.entrySet()) {
            System.out.println("Service" +element.getKey()+" Số lần thuê: "+element.getValue());
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }


    @Override
    public void addNewVilla() {
        try {
            System.out.println("Nhập id");
            String id = sc.nextLine();
            System.out.println("Nhập tên dịch vụ");
            String name = sc.nextLine();
            System.out.println("Nhập diện tích sử dụng");
            int useArea = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập giá thuê");
            int cost = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số lượng người tối đa");
            int people = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập kiểu thuê");
            String type = sc.nextLine();
            System.out.println("Nhập tiêu chuẩn phòng");
            String standard = sc.nextLine();
            System.out.println("Nhập diện tích hồ bơi");
            double poolArea = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập số tầng");
            int floors = Integer.parseInt(sc.nextLine());

            VillaRental villaRental = new VillaRental(id, name, useArea, cost, people, type, standard, poolArea, floors);
            facilityIntegerMap.put(villaRental, 0);
            System.out.println("đã thêm mới villa thành công!");
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
    }

    @Override
    public void addNewHouse() {
        try {
            System.out.println("Nhập id");
            String id = sc.nextLine();
            System.out.println("Nhập tên");
            String name = sc.nextLine();
            System.out.println("Nhập diện tích sử dụng");
            int useArea = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập giá thuê");
            int cost = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số lượng người tối đa");
            int people = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập kiểu thuê");
            String type = sc.nextLine();
            System.out.println("Nhập tiêu chuẩn phòng");
            String standard = sc.nextLine();
            System.out.println("Nhập số tầng");
            int floors = Integer.parseInt(sc.nextLine());

            HouseRental houseRental = new HouseRental(id, name, useArea, cost, people, type, standard, floors);
            facilityIntegerMap.put(houseRental, 0);
            System.out.println("Đã thêm mới house thành công!");
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }

    }

    @Override
    public void addNewRoom() {
        try {
            System.out.println("Nhập id");
            String id = sc.nextLine();
            System.out.println("Nhập tên");
            String name = sc.nextLine();
            System.out.println("Nhập diện tích sử dụng");
            int useArea = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập giá thuê");
            int cost = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số lượng người tối đa");
            int people = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập kiểu thuê");
            String type = sc.nextLine();
            System.out.println("Nhập dịch vụ miễn phí đi kèm");
            String freeService = sc.nextLine();

            RoomRental roomRental = new RoomRental(id, name, useArea, cost, people, type, freeService);
            facilityIntegerMap.put(roomRental, 0);
            System.out.println("Đã thêm mới room thành công!");
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
    }
}
