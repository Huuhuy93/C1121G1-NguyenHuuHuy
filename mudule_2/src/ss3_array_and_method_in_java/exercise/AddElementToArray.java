package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
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
        System.out.println("Enter a number need add : ");
        int x = Integer.parseInt(sc.nextLine());
        int index;

        do {
            System.out.println("Enter index need add : ");
            index = Integer.parseInt(sc.nextLine());
            if (index <= -1 || index > size - 1) {
                System.out.println("Unable to add element to array");
            }
        } while (index <= -1 || index > size - 1);

        for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i-1];
        }
        array[index] = x;
        System.out.println("Array after add " + x + " : " + Arrays.toString(array));
        }
    }
