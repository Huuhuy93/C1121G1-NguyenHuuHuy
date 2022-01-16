package ss10_dsa_stack_queue.exercise.check_bracket_in_expression;

import java.util.Scanner;
import java.util.Stack;

public class BracketUseStack {
        public static boolean checkBracket(String string) {
            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < string.length(); i++) {
                char bracket = string.charAt(i);
                if (bracket == '(') {
                    stack.push(bracket);
                } else if (bracket == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biểu thức cần kiểm tra dấu ngoặc :");
        String string = sc.nextLine();
        if (!checkBracket(string)) {
            System.out.println("Biểu thức dấu ngoặc bị sai");
        } else {
            System.out.println("Biểu thức dấu ngoặc đúng");
        }
    }
}
