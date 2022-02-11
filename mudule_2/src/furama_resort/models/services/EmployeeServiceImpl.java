package furama_resort.models.services;

import furama_resort.models.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService{
    static ArrayList<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee("Nguyen Van A", "20/10/1989","Nam", 201777111, "0905345345",
                "abc@gmail.com", "E101", "Dai hoc", "Quan ly", 3000));

        employeeList.add(new Employee("Nguyen Van B", "01/01/1988", "Nam", 201454521, "0976456454",
                "abcd@gmail.com", "E102", "Cao dang", "Le tan", 500 ));
    }


    @Override
    public void display() {
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

        System.out.println("Enter full name: ");
        String fullName = sc.nextLine();

        System.out.println("Enter date of birth: ");
        String dateOfBirth = sc.nextLine();

        System.out.println("Enter gender: ");
        String gender = sc.nextLine();

        System.out.println("Enter identity card number: ");
        int identityCardNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter email: ");
        String email = sc.nextLine();

        System.out.println("Enter employee code: ");
        String employeeCode = sc.nextLine();

        System.out.println("Enter level: ");
        String level = sc.nextLine();

        System.out.println("Enter position: ");
        String position = sc.nextLine();

        System.out.println("Enter salary: ");
        int salary = Integer.parseInt(sc.nextLine());

        Employee employee = new Employee(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber,
                email, employeeCode, level, position, salary);
        employeeList.add(employee);
        System.out.println(employee);
        System.out.println("successfully added new!");
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name need edit: ");
        String nameEdit = sc.nextLine();

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getFullName().equalsIgnoreCase(nameEdit)) {
                System.out.println("Enter full name need edit: ");
                String fullName = sc.nextLine();

                System.out.println("Enter date of birth need edit: ");
                String dateOfBirth = sc.nextLine();

                System.out.println("Enter gender need edit: ");
                String gender = sc.nextLine();

                System.out.println("Enter identity card number need edit: ");
                int identityCardNumber = Integer.parseInt(sc.nextLine());

                System.out.println("Enter phone number need edit: ");
                String phoneNumber = sc.nextLine();

                System.out.println("Enter email need edit: ");
                String email = sc.nextLine();

                System.out.println("Enter employee code need edit: ");
                String employeeCode = sc.nextLine();

                System.out.println("Enter level need edit: ");
                String level = sc.nextLine();

                System.out.println("Enter position need edit: ");
                String position = sc.nextLine();

                System.out.println("Enter salary need edit: ");
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
                System.out.println("successfully edit!");
                break;

            } else {
                System.out.println("The name to be edit is not in the list!");
                break;
            }
        }
    }
}
