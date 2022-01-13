package ss10_dsa_stack_queue.exercise.check_palindrome_use_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        String firstString = sc.nextLine();
        Queue queue = new LinkedList();
        for (int i = firstString.length()-1; i >= 0 ; i--) {
            queue.add(firstString.charAt(i)+"");
        }
        String reserveString = "";
        while (!queue.isEmpty()) {
            reserveString += queue.remove();
        }
        if (reserveString.equals(firstString)) {
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }
    }
}
