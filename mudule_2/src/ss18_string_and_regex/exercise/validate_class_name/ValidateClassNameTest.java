package ss18_string_and_regex.exercise.validate_class_name;

import java.io.IOException;
import java.util.Scanner;

public class ValidateClassNameTest {
    public static ValidateClassName validateClassName = new ValidateClassName();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp học");
        String className = sc.nextLine();

        try {
            boolean isValid = validateClassName.validate(className);
            System.out.println("Tên lớp nhập vào: " + className + " là " + isValid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();

    }

}
