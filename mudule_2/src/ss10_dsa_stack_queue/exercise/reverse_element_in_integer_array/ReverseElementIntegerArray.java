package ss10_dsa_stack_queue.exercise.reverse_element_in_integer_array;

import java.util.Arrays;
import java.util.Stack;

public class ReverseElementIntegerArray {
    public static void main(String[] args) {
        int[] array;
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        int size = stack.size();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] += stack.pop();


        }
        System.out.println("Mảng mới sau khi đảo là :"+Arrays.toString(array));

    }
}
