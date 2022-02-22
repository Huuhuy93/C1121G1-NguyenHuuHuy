package furama_resort.models.services.impl;

import furama_resort.models.Booking;
import furama_resort.models.Customer;
import furama_resort.models.Facility;
import furama_resort.models.VillaRental;
import furama_resort.models.services.IBookingService;
import furama_resort.utils.BookingCompare;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingCompare());

    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static Scanner sc = new Scanner(System.in);


    static {

        facilityIntegerMap.put(new VillaRental("1", "Villa 1", 100, 1000, 6,
                "day", "normal", 200, 2), 0);
        facilityIntegerMap.put(new VillaRental("2", "Villa 2", 200, 3000, 10,
                "day", "vip", 400, 3), 0);
    }
    @Override
    public void add() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê");
        String startDate = sc.nextLine();
        System.out.println("Nhập ngày trả phòng");
        String endDate = sc.nextLine();

        Booking booking = new Booking(id, startDate, endDate, customer, facility);
        bookingSet.add(booking);
        System.out.println("Đã booking thành công");

    }

    @Override
    public void display() {
        for (Booking booking: bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng: ");
        for (Customer temp: customerList) {
            System.out.println(temp.toString());
        }
        System.out.println("Nhập id của khách hàng");
        try {
            boolean flag = true;
            int id = Integer.parseInt(sc.nextLine());

            while (flag) {
                for (Customer customer: customerList) {
                    if (id==customer.getCustomerId()) {
                        flag = false;
                        return customer;
                    }
                }
                if (flag) {
                    System.out.println("Bạn đã nhập sai, vui lòng nhập id của khách hàng");
                    id = Integer.parseInt(sc.nextLine());
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Danh sách dịch vụ: ");
        for (Map.Entry<Facility, Integer> entry: facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Nhập id dịch vụ");
        boolean flag = true;
        String id = sc.nextLine();

        while (flag) {
            for (Map.Entry<Facility, Integer> entry: facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())) {
                    flag = false;
                    return entry.getKey();
                }
            }
            if (flag) {
                System.out.println("Bạn đã nhập sai, vui lòng nhập id dịch vụ");
                id = sc.nextLine();
            }
        }
        return null;
    }

    @Override
    public void edit() {

    }
}
