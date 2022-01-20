package ss15_handle_exception_and_debug.practice.number_format_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập y: ");
        int y = Integer.parseInt(sc.nextLine());
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }
}
