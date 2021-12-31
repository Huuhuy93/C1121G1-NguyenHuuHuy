package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f;
        double c;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    f = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " +fahrenheitToCelsius(f));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    c = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " +celsiusToFahrenheit(c));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
