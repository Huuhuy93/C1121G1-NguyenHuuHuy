package furama_resort.models.services.impl;

import furama_resort.models.*;
import furama_resort.models.services.IFacilityService;
import furama_resort.utils.ReadAndWriteStringToCSV;
import javafx.scene.transform.Scale;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    String pathFileFacility = "src\\furama_resort\\data\\facility.csv";
    String pathFileVilla = "src\\furama_resort\\data\\villa.csv";
    String pathFileHouse = "src\\furama_resort\\data\\house.csv";
    String pathFileRoom = "src\\furama_resort\\data\\room.csv";
    ReadAndWriteStringToCSV readAndWriteStringToCSV = new ReadAndWriteStringToCSV();

    private static Scanner sc = new Scanner(System.in);


    @Override
    public void display() {
        List<String> list = ReadAndWriteStringToCSV.read(pathFileFacility);
        String[] arrayVilla;
        if (list.isEmpty()) {
            System.out.println("danh sách đang trống!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                arrayVilla = list.get(i).split(",");

                if (arrayVilla[0].contains("SVVL")) {
                    VillaRental villaRental = new VillaRental(arrayVilla[0], arrayVilla[1], Integer.parseInt(arrayVilla[2]),
                            Integer.parseInt(arrayVilla[3]), Integer.parseInt(arrayVilla[4]), arrayVilla[5], arrayVilla[6],
                            Double.parseDouble(arrayVilla[7]), Integer.parseInt(arrayVilla[8]));
                    System.out.println(villaRental);
                }
            }
        }

        List<String> list1 = ReadAndWriteStringToCSV.read(pathFileFacility);
        String[] arrayHouse;
        if (list1.isEmpty()) {
            System.out.println("danh sách đang trống!");
        } else {
            for (int i = 0; i < list1.size(); i++) {
                arrayHouse = list1.get(i).split(",");

                if (arrayHouse[0].contains("SVHO")) {
                    HouseRental houseRental = new HouseRental(arrayHouse[0], arrayHouse[1], Integer.parseInt(arrayHouse[2]),
                            Integer.parseInt(arrayHouse[3]), Integer.parseInt(arrayHouse[4]), arrayHouse[5], arrayHouse[6],
                            Integer.parseInt(arrayHouse[7]));
                    System.out.println(houseRental);
                }
            }
        }

        List<String> list2 = ReadAndWriteStringToCSV.read(pathFileFacility);
        String[] arrayRoom;
        if (list1.isEmpty()) {
            System.out.println("danh sách đang trống!");
        } else {
            for (int i = 0; i < list2.size(); i++) {
                arrayRoom = list2.get(i).split(",");

                if (arrayRoom[0].contains("SVRO")) {
                    RoomRental roomRental = new RoomRental(arrayRoom[0], arrayRoom[1], Integer.parseInt(arrayRoom[2]),
                            Integer.parseInt(arrayRoom[3]), Integer.parseInt(arrayRoom[4]), arrayRoom[5], arrayRoom[6]);
                    System.out.println(roomRental);
                }
            }
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
        List<Facility> facilityList = new ArrayList<>();

        System.out.println("Nhập id dịch vụ");
        String id = sc.nextLine();

        System.out.println("Nhập tên dịch vụ");
        String name = sc.nextLine();

        int useArea;
        while (true) {
            try {
                System.out.println("Nhập diện tích sử dụng");
                useArea = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("sai địng dạng");
            }
        }

        int cost;
        while (true) {
            try {
                System.out.println("Nhập giá thuê");
                cost = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("sai địng dạng");
            }
        }

        int people;
        while (true) {
            try {
                System.out.println("Nhập số lượng người tối đa");
                people = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("sai địng dạng");
            }
        }


        System.out.println("Nhập kiểu thuê");
        String type = sc.nextLine();

        System.out.println("Nhập tiêu chuẩn phòng");
        String standard = sc.nextLine();

        double poolArea;
        while (true) {
            try {
                System.out.println("Nhập diện tích hồ bơi");
                poolArea = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("sai địng dạng");
            }
        }

        int floors;
        while (true) {
            try {
                System.out.println("Nhập số tầng");
                floors = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("sai địng dạng");
            }
        }

        VillaRental villaRental = new VillaRental(id, name, useArea, cost, people, type, standard, poolArea, floors);
        facilityList.add(villaRental);

        List<String> list = readAndWriteStringToCSV.changeToStringList(facilityList);
        ReadAndWriteStringToCSV.write(list, pathFileFacility, true);
        ReadAndWriteStringToCSV.write(list, pathFileVilla, true);

        System.out.println("đã thêm mới villa thành công!");
    }

    @Override
    public void addNewHouse() {
        List<Facility> facilityList = new ArrayList<>();

            System.out.println("Nhập id");
            String id = sc.nextLine();
            System.out.println("Nhập tên");
            String name = sc.nextLine();
            int useArea;
            while (true) {
                try {
                    System.out.println("Nhập diện tích sử dụng");
                    useArea = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("sai địng dạng");
                }
            }

            int cost;
            while (true) {
                try {
                    System.out.println("Nhập giá thuê");
                    cost = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("sai địng dạng");
                }
            }

            int people = 0;
            while (true) {
                try {
                    System.out.println("Nhập số lượng người tối đa");
                    cost = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("sai địng dạng");
                }
            }
            System.out.println("Nhập kiểu thuê");
            String type = sc.nextLine();
            System.out.println("Nhập tiêu chuẩn phòng");
            String standard = sc.nextLine();
            System.out.println("Nhập số tầng");
            int floors = Integer.parseInt(sc.nextLine());

            HouseRental houseRental = new HouseRental(id, name, useArea, cost, people, type, standard, floors);
            facilityList.add(houseRental);

            List<String> list = readAndWriteStringToCSV.changeToStringList(facilityList);
            ReadAndWriteStringToCSV.write(list, pathFileFacility, true);
            ReadAndWriteStringToCSV.write(list, pathFileHouse, true);

            System.out.println("Đã thêm mới house thành công!");
    }

    @Override
    public void addNewRoom() {
        List<Facility> facilityList = new ArrayList<>();

            System.out.println("Nhập id");
            String id = sc.nextLine();
            System.out.println("Nhập tên");
            String name = sc.nextLine();
            int useArea;
            while (true) {
                try {
                    System.out.println("Nhập diện tích sử dụng");
                    useArea = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("sai địng dạng");
                }
            }

            int cost;
            while (true) {
                try {
                    System.out.println("Nhập giá thuê");
                    cost = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("sai địng dạng");
                }
            }

            int people = 0;
            while (true) {
                try {
                    System.out.println("Nhập số lượng người tối đa");
                    cost = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("sai địng dạng");
                }
            }
            System.out.println("Nhập kiểu thuê");
            String type = sc.nextLine();
            System.out.println("Nhập dịch vụ miễn phí đi kèm");
            String freeService = sc.nextLine();

            RoomRental roomRental = new RoomRental(id, name, useArea, cost, people, type, freeService);
            facilityList.add(roomRental);

            List<String> list = readAndWriteStringToCSV.changeToStringList(facilityList);
            ReadAndWriteStringToCSV.write(list, pathFileFacility, true);
            ReadAndWriteStringToCSV.write(list, pathFileRoom, true);
            System.out.println("Đã thêm mới room thành công!");
    }
}
