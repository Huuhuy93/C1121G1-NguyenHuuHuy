package ss11_java_collection_framework.exercise.product_use_arraylist.model.service;

import ss11_java_collection_framework.exercise.product_use_arraylist.model.MobilePhone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilephoneServiceImpl implements IServiceProduct {
    MobilePhone[] mobilePhonesList = new MobilePhone[100];
    ArrayList<MobilePhone> mobilePhonesArrayList = new ArrayList<>();




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
        for (int i = 0; i < mobilePhonesArrayList.size(); i++) {
            if (mobilePhonesArrayList.get(i) == null) {
                mobilePhonesArrayList.set(i, mobilePhone);
                break;
            }
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < mobilePhonesArrayList.size(); i++ ) {
            if (mobilePhonesArrayList.get(i) != null) {
                System.out.println(mobilePhonesArrayList.get(i).toString());
            }
        }
    }

    @Override
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần xóa");
        int idDlelete = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < mobilePhonesArrayList.size(); i++ ) {
            if (mobilePhonesArrayList.get(i).getId() == idDlelete) {
                mobilePhonesArrayList.remove(i);
            }
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void search() {

    }
}
