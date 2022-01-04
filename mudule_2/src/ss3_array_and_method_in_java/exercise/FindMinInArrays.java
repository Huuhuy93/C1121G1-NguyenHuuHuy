package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class FindMinInArrays {
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = Integer.parseInt(sc.nextLine());
            if (size < 0) {
                System.out.println("Size should not less than 0");
            }
        } while (size < 0);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element" + (i + 1) + " : ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index] + " at postition " +index);
    }
}
