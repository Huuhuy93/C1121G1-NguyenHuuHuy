package ss10_dsa_stack_queue.exercise.reverse_element_in_integer_array;

import java.util.Stack;

public class ReserveCharUseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String str = "abcde";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i)+"");
        }
        int size = stack.size();
        System.out.println(stack);
        String str2 = "";
        for (int i = 0; i < size; i++) {
            str2 += stack.pop();
        }
        System.out.println("Chuỗi sau khi đảo là :"+str2);
    }
}