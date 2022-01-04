package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter element " + (i + 1) + " of array 1 : ");
            array1[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter element " + (i + 1) + " of array 2 : ");
            array2[i] = Integer.parseInt(sc.nextLine());
        }

        int length = array1.length + array2.length;
        int[] array = new int[length];
        int i = 0;

        for (int element : array1) {
            array[i] = element;
            i++;
        }

        for (int element : array2) {
            array[i] = element;
            i++;
        }
        System.out.println("Array after merge array1 and array2 : " + Arrays.toString(array));


    }
}
