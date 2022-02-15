package furama_resort.models.services;

import furama_resort.models.Employee;
import furama_resort.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService{
    static List<Employee> employeeList = new ArrayList<>();


    @Override
    public void display() {
        employeeList = (List<Employee>) ReadAndWrite.read("D:\\Codegym\\mudule_2\\src\\data\\employee.csv");
        for (Employee temp : employeeList) {
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
            System.out.println("Nhập id nhân viên");
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

            System.out.println("Nhập mã nhân viên: ");
            String employeeCode = sc.nextLine();

            System.out.println("Nhập cấp bậc nhân viên: ");
            String level = sc.nextLine();

            System.out.println("Nhập vị trí: ");
            String position = sc.nextLine();

            System.out.println("Nhập lương: ");
            int salary = Integer.parseInt(sc.nextLine());

            Employee employee = new Employee(id, fullName, dateOfBirth, gender, identityCardNumber, phoneNumber,
                    email, employeeCode, level, position, salary);
            employeeList.add(employee);
            ReadAndWrite.write(employeeList, "D:\\Codegym\\mudule_2\\src\\data\\employee.csv");

            System.out.println(employee);
            System.out.println("Thêm mới thành công!");
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }

    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập id nhân viên cần sửa");
            int idEdit = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getId() == idEdit) {
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

                    System.out.println("Nhập mã nhân viên cần sửa: ");
                    String employeeCode = sc.nextLine();

                    System.out.println("Nhập cấp bậc nhân viên cần sửa: ");
                    String level = sc.nextLine();

                    System.out.println("Nhập vị trí cần sửa: ");
                    String position = sc.nextLine();

                    System.out.println("Nhập lương cần sửa: ");
                    int salary = Integer.parseInt(sc.nextLine());

                    employeeList.get(i).setFullName(fullName);
                    employeeList.get(i).setDateOfBirth(dateOfBirth);
                    employeeList.get(i).setGender(gender);
                    employeeList.get(i).setIdentityCardNumber(identityCardNumber);
                    employeeList.get(i).setPhoneNumber(phoneNumber);
                    employeeList.get(i).setEmail(email);
                    employeeList.get(i).setEmployeeCode(employeeCode);
                    employeeList.get(i).setLevel(level);
                    employeeList.get(i).setPosition(position);
                    employeeList.get(i).setSalary(salary);

                    System.out.println(employeeList.get(i));
                    System.out.println("Sửa thành công!");
                    break;

                } else {
                    System.out.println("Id của nhân viên vừa nhập này không có trong danh sách!");
                    break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
    }
}
