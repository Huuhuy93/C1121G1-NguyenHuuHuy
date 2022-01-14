package ss11_java_collection_framework.exercise.product_use_arraylist.model.service;

import ss11_java_collection_framework.exercise.product_use_arraylist.model.MobilePhone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilephoneServiceImpl implements IServiceProduct {
    static ArrayList<MobilePhone> mobilePhonesList = new ArrayList<>();

    static {
        mobilePhonesList.add(new MobilePhone(1, "mobilephone", 5000, "13 pro max", "apple"));
        mobilePhonesList.add(new MobilePhone(2, "mobilephone", 3000, "note 20", "samsung"));
        mobilePhonesList.add(new MobilePhone(3, "mobilephone", 2000, "z3", "sony"));
    }


    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên sản phẩm");
        String nameProduct = sc.nextLine();
        System.out.println("nhập giá của sản phẩm");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("nhập loại sản phẩm ");
        String name = sc.nextLine();
        System.out.println("nhập hãng sản xuất");
        String brand = sc.nextLine();
        MobilePhone mobilePhone = new MobilePhone(id, nameProduct, price, name, brand);
        mobilePhonesList.add(mobilePhone);
        System.err.println("Thêm mới thành công");
    }

    @Override
    public void display() {
        for (MobilePhone temp : mobilePhonesList) {
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
        System.out.println("Nhập id cần xóa");
        int idDlelete = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < mobilePhonesList.size(); i++) {
            if (mobilePhonesList.get(i).getId() == idDlelete) {
                mobilePhonesList.remove(i);
                System.out.println("Đã xóa thành công");
            } else {
                System.out.println("không có phần tử cần xóa");
            }
        }
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id bạn cần chỉnh sửa");
        int idEdit = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < mobilePhonesList.size(); i++) {
            if (i == idEdit) {
                System.out.println("nhập id cần chỉnh sửa");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("nhập tên sản phẩm cần chỉnh sửa");
                String nameProduct = sc.nextLine();
                System.out.println("nhập giá của sản phẩm cần chỉnh sửa");
                int price = Integer.parseInt(sc.nextLine());
                System.out.println("nhập loại sản phẩm cần chỉnh sửa ");
                String name = sc.nextLine();
                System.out.println("nhập hãng sản xuất cần chỉnh sửa");
                String brand = sc.nextLine();
                mobilePhonesList.get(i).setId(id);
                mobilePhonesList.get(i).setNameProduct(nameProduct);
                mobilePhonesList.get(i).setPriceProduct(price);
                mobilePhonesList.get(i).setNamePhone(name);
                mobilePhonesList.get(i).setBrand(brand);
                break;
            }
        }
    }

    @Override
    public void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm kiếm");
        String nameSearch = sc.nextLine();
        for (MobilePhone mobilePhone : mobilePhonesList) {
            if (mobilePhone.getNamePhone().equalsIgnoreCase(nameSearch)) {
                System.out.println(mobilePhone);
            }
        }
    }
}
