package furama_resort.controllers;

import furama_resort.models.services.impl.BookingServiceImpl;
import furama_resort.models.services.impl.CustomerServiceImpl;
import furama_resort.models.services.impl.EmployeeServiceImpl;
import furama_resort.models.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();

        int chooseMenu = 0;
        boolean flag = true;

        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management\n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit!\n");
            System.out.println("Please select function :");
            try {
                chooseMenu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }

            switch (chooseMenu) {
                case 1:
                    do {
                        System.out.println("1\tDisplay list employees\n" +
                                "2\tAdd new employee\n" +
                                "3\tEdit employee\n" +
                                "4\tReturn main menu\n");
                        int typeEmployee = 0;
                        try {
                            typeEmployee = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
                        }

                        switch (typeEmployee) {
                            case 1:
                                System.out.println("Display list employees");
                                employeeService.display();
                                break;
                            case 2:
                                System.out.println("Add new employee");
                                employeeService.add();
                                break;
                            case 3:
                                System.out.println("Edit employee");
                                employeeService.edit();
                                break;
                            case 4:
                                displayMainMenu();
                                break;
                        }
                    } while (flag);

                    break;


                case 2:
                    do {
                        System.out.println("1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4\tReturn main menu\n");
                        int typeCustomers = 0;
                        try {
                            typeCustomers = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
                        }

                        switch (typeCustomers) {
                            case 1:
                                System.out.println("Display list customers");
                                customerService.display();
                                break;
                            case 2:
                                System.out.println("Add new customer");
                                customerService.add();
                                break;
                            case 3:
                                System.out.println("Edit customer");
                                customerService.edit();
                                break;
                            case 4:
                                displayMainMenu();
                                break;
                        }
                    } while (flag);

                    break;


                case 3:
                    do {
                        System.out.println("1\tDisplay list facility\n" +
                                "2\tAdd new facility\n" +
                                "3\tDisplay list facility maintenance" +
                                "4\tReturn main menu\n");
                        int typeFacility = 0;
                        try {
                            typeFacility = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
                        }

                        switch (typeFacility) {
                            case 1:
                                System.out.println("Display list facility");
                                facilityService.display();
                                break;
                            case 2:
                                System.out.println("Add new facility");

                                do {
                                    System.out.println("1.\tAdd new Villa\n" +
                                            "2.\tAdd new House\n" +
                                            "3.\tAdd new Room\n" +
                                            "4\tReturn main menu\n");
                                    int typeAddFacility = Integer.parseInt(sc.nextLine());

                                    switch (typeAddFacility) {
                                        case 1:
                                            System.out.println("Add new Villa");
                                            facilityService.addNewVilla();
                                            break;
                                        case 2:
                                            System.out.println("Add new House");
                                            facilityService.addNewHouse();
                                            break;
                                        case 3:
                                            System.out.println("Add new Room");
                                            facilityService.addNewRoom();
                                            break;
                                        case 4:
                                            displayMainMenu();
                                            break;
                                    }
                                } while (flag);

                                break;
                            case 3:
                                System.out.println("Display list facility maintenance");
                                break;
                            case 4:
                                displayMainMenu();
                                break;
                        }
                    } while (flag);

                    break;


                case 4:
                    do {
                        System.out.println("1.\tAdd new booking\n" +
                                "2.\tDisplay list booking\n" +
                                "3.\tCreate new constracts\n" +
                                "4.\tDisplay list contracts\n" +
                                "5.\tEdit contracts\n" +
                                "6.\tReturn main menu\n");
                        int typeBooking = 0;
                        try {
                            typeBooking = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
                        }
                        switch (typeBooking) {
                            case 1:
                                System.out.println("Add new booking");
                                bookingService.add();
                                break;
                            case 2:
                                System.out.println("Display list booking");
                                bookingService.display();
                                break;
                            case 3:
                                System.out.println("Create new constracts");

                                break;
                            case 4:
                                System.out.println("Display list contracts");
                                break;
                            case 5:
                                System.out.println("Edit contracts");
                                bookingService.edit();
                                break;
                            case 6:
                                displayMainMenu();
                                break;
                        }
                    } while (flag);

                    break;

                case 5:
                    do {
                        System.out.println("1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu\n");
                        int typePromotion = 0;
                        try {
                            typePromotion = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
                        }
                        switch (typePromotion) {
                            case 1:
                                System.out.println("Display list customers use service");
                                break;
                            case 2:
                                System.out.println("Display list customers get voucher");
                                break;
                            case 3:
                                displayMainMenu();
                                break;
                        }
                    } while (flag);

                    break;

                case 6:
                    System.out.println("Exit!");
                    flag = false;
            }
        } while (flag);

    }
}
