package ss1_introduce_to_java.bai_tap;

import java.util.Scanner;

public class MoneyCovert {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD money");
        usd = sc.nextDouble();
        double convert = usd * vnd;
        System.out.println("VND money is : " + convert);
    }
}
