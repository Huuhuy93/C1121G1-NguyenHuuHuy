package ss2_loop_in_java.practice;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 0;
        double interestRate = 1.0;
        int month = 1;
        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.println("Enter number of months: ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * interestRate / 100 / 12;
            money += money * interestRate / 100 / 12;
        }
        System.out.println("Total of interest: " + totalInterest);
        System.out.println("Total of your money : " + money);
    }
}
