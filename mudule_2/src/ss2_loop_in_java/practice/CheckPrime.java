package ss2_loop_in_java.practice;

import java.util.Scanner;

public class CheckPrime {
    public static Boolean isPrime(int number){
        Boolean check = true;
        if (number>1){
            for (int i  =2;i <=Math.sqrt(number);i++ ){
                if (number % i ==0){
                    check = false;
                } else {
                    check = true;
                }
            }
        } else {
            check = false;
        }
        if (check){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (isPrime(num)){
            System.out.println(num+ " is a prime");
        } else {
            System.out.println(num+ " is not a prime");
        }
    }
}
