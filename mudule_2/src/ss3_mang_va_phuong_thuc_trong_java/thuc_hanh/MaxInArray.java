package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j + 1;

            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
