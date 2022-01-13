package ss10_dsa_stack_queue.exercise.convert_decimal_to_binary_number;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập vào số thập phân :");
        int number = Integer.parseInt(sc.nextLine());
        while (number != 0) {
            int binary = number % 2;
            stack.push(binary);
            number /= 2;
        }
        String str = "";
        while (!stack.isEmpty()) {
            str += stack.pop();
        }
        System.out.println("Hệ nhị phân sau khi chuyển đổi từ hệ thập phân : "+str);
    }
}
