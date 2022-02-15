package furama_resort.models.services;

import furama_resort.models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService{
    static List<Customer> customerList = new LinkedList<>();

    @Override
    public void display() {
        for (Customer temp: customerList) {
            if (temp==null) {
                break;
            } else {
                System.out.println(temp.toString());
            }
        }
    }

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhập id khách hàng");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Nhập họ và tên: ");
            String fullName = sc.nextLine();

            System.out.println("Nhập ngày sinh: ");
            String dateOfBirth = sc.nextLine();

            System.out.println("Nhập giới tính: ");
            String gender = sc.nextLine();

            System.out.println("Nhập số cmnd: ");
            int identityCardNumber = Integer.parseInt(sc.nextLine());

            System.out.println("Nhập số điện thoại: ");
            String phoneNumber = sc.nextLine();

            System.out.println("Nhập email: ");
            String email = sc.nextLine();

            System.out.println("Nhập mã khách hàng: ");
            String customerCode = sc.nextLine();

            System.out.println("Nhập loại khách: ");
            String typeCustomer = sc.nextLine();

            System.out.println("Nhập địa chỉ: ");
            String address = sc.nextLine();

            Customer customer = new Customer(id, fullName, dateOfBirth, gender, identityCardNumber, phoneNumber,
                    email, customerCode, typeCustomer, address);
            customerList.add(customer);
            System.out.println(customer);
            System.out.println("Thêm mới thành công!");
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập họ và tên cần sửa: ");
            String nameEdit = sc.nextLine();

            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getFullName().equalsIgnoreCase(nameEdit)) {
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

                    System.out.println("Nhập mã khách hàng cần sủa: ");
                    String customerCode = sc.nextLine();

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
                    customerList.get(i).setCustomerCode(customerCode);
                    customerList.get(i).setTypeCustomer(typeCustomer);
                    customerList.get(i).setAddress(address);

                    System.out.println(customerList.get(i));
                    System.out.println("Sửa thành công!");
                    break;

                }else {
                    System.out.println("Tên khách hàng vừa nhập không có trong danh sách!");
                    break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
    }
}
