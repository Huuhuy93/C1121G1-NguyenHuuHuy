package ss15_handle_exception_and_debug.exercise.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleCheck check = new TriangleCheck();

        try {
            System.out.println("Nhập vào cạnh a: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào cạnh b: ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào cạnh c: ");
            int c = Integer.parseInt(sc.nextLine());

            try {
                check.TriangleCheck(a, b, c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Sai : không đúng định dạng!");
        }

    }
}
