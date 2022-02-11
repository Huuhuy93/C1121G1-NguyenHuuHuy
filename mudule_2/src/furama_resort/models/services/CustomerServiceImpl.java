package furama_resort.models.services;

import furama_resort.models.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService{
    static ArrayList<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer("Le Van A", "1/1/1990", "Male",
                201367213, "0378112233", "ee@gmail.com",
                "C101", "Diamond", "Da Nang" ));
        customerList.add(new Customer("Le Van B", "1/2/1980", "Female",
                201222444, "0909123234", "ebaac@gmail.com",
                "C102", "Gold", "Quang Nam" ));
    }

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

        System.out.println("Enter customer code: ");
        String customerCode = sc.nextLine();

        System.out.println("Enter type customer: ");
        String typeCustomer = sc.nextLine();

        System.out.println("Enter address: ");
        String address = sc.nextLine();

        Customer customer = new Customer(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber,
                email, customerCode, typeCustomer, address);
        customerList.add(customer);
        System.out.println(customer);
        System.out.println("successfully added new!");
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name need edit: ");
        String nameEdit = sc.nextLine();

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getFullName().equalsIgnoreCase(nameEdit)) {
                System.out.println("Emter full name need edit: ");
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

                System.out.println("Enter customer code need edit: ");
                String customerCode = sc.nextLine();

                System.out.println("Enter type customer need edit: ");
                String typeCustomer = sc.nextLine();

                System.out.println("Enter address need edit: ");
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
                System.out.println("successfully edit!");
                break;

            }else {
                System.out.println("The name to be edit is not in the list!");
                break;
            }
        }
    }
}
