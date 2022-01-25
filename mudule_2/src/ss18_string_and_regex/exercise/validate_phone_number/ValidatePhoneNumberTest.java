package ss18_string_and_regex.exercise.validate_phone_number;

import java.io.IOException;
import java.util.Scanner;

public class ValidatePhoneNumberTest {
    public static ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại cần kiểm tra");
        String phoneNumber = sc.nextLine();

        boolean check = validatePhoneNumber.validate(phoneNumber);
        System.out.println("Số điện thoại: "+phoneNumber+" là "+check);
    }
}
