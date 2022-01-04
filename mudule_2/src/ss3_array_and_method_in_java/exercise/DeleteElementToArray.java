package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementToArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a size in Array : ");
            size = Integer.parseInt(sc.nextLine());
            if (size < 0) {
                System.out.println("Size should not lesser 0");
            }
        } while (size < 0);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Enter a number need delete : ");
        int x = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                for (int j = i; j < array.length-1; j++) {
                    array[j] = array[j + 1];
                }
                i--;
                array[array.length - 1] = 0;
            }
        }
        System.out.println("Array after delete : " + Arrays.toString(array));

    }
}
