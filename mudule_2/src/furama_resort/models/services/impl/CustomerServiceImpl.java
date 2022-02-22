package furama_resort.models.services.impl;

import furama_resort.models.Customer;
import furama_resort.models.services.ICustomerService;
import furama_resort.utils.ReadAndWriteStringToCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    String pathFileCustomer = "src\\furama_resort\\data\\customer.csv";
    ReadAndWriteStringToCSV readAndWriteStringToCSV = new ReadAndWriteStringToCSV();


    @Override
    public void display() {
        List<String> list = ReadAndWriteStringToCSV.read(pathFileCustomer);
        String[] array;
        Customer.setCustomerCode(0);
        if (list.isEmpty()) {
            System.out.println("danh sách đang trống!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                array = list.get(i).split(",");
                Customer customer = new Customer(array[1], array[2], array[3], Integer.parseInt(array[4]),
                        array[5], array[6], array[7], array[8]);
                System.out.println(customer);
            }
        }
    }

    @Override
    public void add() {
        List<Customer> customerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập họ và tên: ");
        String fullName = sc.nextLine();

        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = sc.nextLine();

        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();

        int identityCardNumber;
        while (true) {
            try {
                System.out.println("Nhập số cmnd khach hang");
                identityCardNumber = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("sai địng dạng");
            }
        }

        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();

        System.out.println("Nhập email: ");
        String email = sc.nextLine();

        System.out.println("Nhập loại khách: ");
        String typeCustomer = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        Customer customer = new Customer(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber,
                email, typeCustomer, address);

        customerList.add(customer);

        List<String> list = readAndWriteStringToCSV.changeToStringList(customerList);
        ReadAndWriteStringToCSV.write(list, pathFileCustomer, true);

        System.out.println(customer);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void edit() {
        List<Customer> customerList = new ArrayList<>();
        List<String> list = ReadAndWriteStringToCSV.read(pathFileCustomer);
        String[] array;
        Customer.setCustomerCode(0);
        if (list.isEmpty()) {
            System.out.println("danh sách đang trống!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                array = list.get(i).split(",");
                Customer customer = new Customer(array[1], array[2], array[3], Integer.parseInt(array[4]),
                        array[5], array[6], array[7], array[8]);
                System.out.println(customer);
                customerList.add(customer);
            }
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id khách hàng cần sủa: ");
        int idEdit = Integer.parseInt(sc.nextLine());
        boolean flag = false;

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId() == idEdit) {
                System.out.println("Nhập họ và tên cần sửa: ");
                String fullName = sc.nextLine();

                System.out.println("Nhập ngày sinh cần sửa: ");
                String dateOfBirth = sc.nextLine();

                System.out.println("Nhập giới tính cần sửa: ");
                String gender = sc.nextLine();

                System.out.println("Nhập số cmnd cần sửa: ");
                int identityCardNumber = Integer.parseInt(sc.nextLine());

                System.out.println("Nhập số điện thoại cần sửa: ");
                String phoneNumber = sc.nextLine();

                System.out.println("Nhập email cần sửa: ");
                String email = sc.nextLine();

                System.out.println("Nhập loại khách hàng cần sửa: ");
                String typeCustomer = sc.nextLine();

                System.out.println("Nhập địa chỉ cần sửa: ");
                String address = sc.nextLine();

                customerList.get(i).setFullName(fullName);
                customerList.get(i).setDateOfBirth(dateOfBirth);
                customerList.get(i).setGender(gender);
                customerList.get(i).setIdentityCardNumber(identityCardNumber);
                customerList.get(i).setPhoneNumber(phoneNumber);
                customerList.get(i).setEmail(email);
                customerList.get(i).setTypeCustomer(typeCustomer);
                customerList.get(i).setAddress(address);

                System.out.println(customerList.get(i));
                System.out.println("Sửa thành công!");

                List<String> list2 = readAndWriteStringToCSV.changeToStringList(customerList);
                ReadAndWriteStringToCSV.write(list2, pathFileCustomer, false);

                flag = true;
                break;

            }
        }

        if (!flag) {
            System.out.println("Id khách hàng vừa nhập không có trong danh sách!");
        }
    }
}
