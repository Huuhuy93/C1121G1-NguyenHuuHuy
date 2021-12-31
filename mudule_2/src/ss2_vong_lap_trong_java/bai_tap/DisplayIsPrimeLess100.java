package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class DisplayIsPrimeLess100 {
    public static Boolean isPrime(int number) {
        boolean flag = true;
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 2;
        String result = "";
        for (int j = 2; j < 100; j++) {
            if (isPrime(num)==true){
                result += num +",";
            }
            num++;
        }
        System.out.println("Dãy số nguyên tố nhỏ hơn 100 là : " + result);
    }
}
