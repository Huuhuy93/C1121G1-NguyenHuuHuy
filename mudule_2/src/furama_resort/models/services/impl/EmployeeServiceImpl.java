package furama_resort.models.services.impl;

import furama_resort.models.Employee;
import furama_resort.models.services.IEmployeeService;
import furama_resort.utils.ReadAndWriteStringToCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    String pathFileEmployee = "src\\furama_resort\\data\\employee.csv";
    static final String FILELEVEL =  "src/furama_resort/data/level.csv";
    ReadAndWriteStringToCSV readAndWriteStringToCSV = new ReadAndWriteStringToCSV();



    @Override
    public void display() {
        List<String> list = ReadAndWriteStringToCSV.read(pathFileEmployee);
        String[] array;
        Employee.setEmployeeCode(0);
        if (list.isEmpty()) {
            System.out.println("danh sách đang trống!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                array = list.get(i).split(",");
                Employee employee = new Employee(array[1], array[2], array[3], Integer.parseInt(array[4]),
                        array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));
                System.out.println(employee);
            }
        }
    }

    @Override
    public void add() {
        List<Employee> employeeList = new ArrayList<>();
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
                System.out.println("Nhập số cmnd nhân viên");
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

        String level = sc.nextLine();
        boolean flag = true;

        do {
            System.out.println("1.\tTrung cấp\n" +
                    "2.\tCao đẳng\n" +
                    "3.\tĐại học\n");
            int typeCustomers = 0;
            try {
                typeCustomers = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }

            switch (typeCustomers) {
                case 1:
                    System.out.println("Trung cấp");
                    level = "Trung cấp";
                    flag =false;
                    break;
                case 2:
                    System.out.println("Cao đẳng");
                    level = "Cao đẳng";
                    flag = false;
                    break;
                case 3:
                    System.out.println("Đại học");
                    level = "Đại học";
                    flag = false;
                    break;
                default:
                    System.out.println("vui lòng nhập lại");
                    break;
            }
        } while (flag);

        System.out.println("Nhập vị trí: ");
        String position = sc.nextLine();

        int salary;
        while (true) {
            try {
                System.out.println("Nhập lương nhân viên");
                salary = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("sai địng dạng");
            }
        }

        Employee employee = new Employee(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber,
                email, level, position, salary);

        employeeList.add(employee);

        List<String> list = readAndWriteStringToCSV.changeToStringList(employeeList);
        ReadAndWriteStringToCSV.write(list, pathFileEmployee, true);

        System.out.println(employee);
        System.out.println("Thêm mới thành công!");

    }

    @Override
    public void edit() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> list = ReadAndWriteStringToCSV.read(pathFileEmployee);
        String[] array;
        Employee.setEmployeeCode(0);
        if (list.isEmpty()) {
            System.out.println("danh sách đang trống!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                array = list.get(i).split(",");
                Employee employee = new Employee(array[1], array[2], array[3], Integer.parseInt(array[4]),
                        array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));
                System.out.println(employee);
                employeeList.add(employee);
            }
        }

        Scanner sc = new Scanner(System.in);

        int idEdit;
        while (true) {
            try {
                System.out.println("Nhập id nhân viên");
                idEdit = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("sai địng dạng");
            }
        }
        boolean flag = false;
        for (int j = 0; j < employeeList.size(); j++) {
            if (employeeList.get(j).getEmployeeId() == idEdit) {
                System.out.println("Nhập họ và tên cần sửa: ");
                String fullName = sc.nextLine();

                System.out.println("Nhập ngày sinh cần sửa: ");
                String dateOfBirth = sc.nextLine();

                System.out.println("Nhập giới tính cần sửa: ");
                String gender = sc.nextLine();

                int identityCardNumber;
                while (true) {
                    try {
                        System.out.println("Nhập số cmnd nhân viên");
                        identityCardNumber = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("sai địng dạng");
                    }
                }

                System.out.println("Nhập số điện thoại cần sửa: ");
                String phoneNumber = sc.nextLine();

                System.out.println("Nhập email cần sửa: ");
                String email = sc.nextLine();

                System.out.println("Nhập cấp bậc nhân viên cần sửa: ");
                String level = sc.nextLine();

                System.out.println("Nhập vị trí cần sửa: ");
                String position = sc.nextLine();

                int salary;
                while (true) {
                    try {
                        System.out.println("Nhập lương nhân viên");
                        salary = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("sai địng dạng");
                    }
                }

                employeeList.get(j).setFullName(fullName);
                employeeList.get(j).setDateOfBirth(dateOfBirth);
                employeeList.get(j).setGender(gender);
                employeeList.get(j).setIdentityCardNumber(identityCardNumber);
                employeeList.get(j).setPhoneNumber(phoneNumber);
                employeeList.get(j).setEmail(email);
                employeeList.get(j).setLevel(level);
                employeeList.get(j).setPosition(position);
                employeeList.get(j).setSalary(salary);

                System.out.println(employeeList.get(j));
                System.out.println("Sửa thành công!");

                List<String> list2 = readAndWriteStringToCSV.changeToStringList(employeeList);
                ReadAndWriteStringToCSV.write(list2, pathFileEmployee, false);
                flag = true;
                break;

            }
        }
        if (!flag) {
            System.out.println("Nhân viên vừa  nhập không có trong danh sách!");
        }
    }
}