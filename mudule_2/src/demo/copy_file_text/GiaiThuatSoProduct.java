package demo.copy_file_text;

import java.util.Scanner;

public class GiaiThuatSoProduct {
    public static boolean solution(int num) {
        int sqrtNum = (int) Math.sqrt(num);
        int product = sqrtNum * (sqrtNum + 1);
        if (product == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int number = sc.nextInt();
        if (solution(number) == true) {
            System.out.println("Số này là product");
        } else {
            System.out.println("Số này không phải là product");
        }

    }
}



