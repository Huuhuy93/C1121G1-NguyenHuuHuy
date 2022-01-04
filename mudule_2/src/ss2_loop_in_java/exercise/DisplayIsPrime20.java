package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayIsPrime20 {
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
        System.out.println("Enter number of primes to print");
        int number = Integer.parseInt(sc.nextLine());
        int count = 0;
        int num = 2;
        String result = "";
        while (count < number) {
            if (isPrime(num) == true) {
                result += num + ",";
                count++;
            }
            num++;
        }
        System.out.println("Dãy số nguyên tố là : " + result);
    }
}
