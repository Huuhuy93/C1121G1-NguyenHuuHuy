package ss14_sort_algorithm.exercise;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] list) {
        int x;
        int pos;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;

            while (0 < pos && x < list[pos - 1]) {
                list[pos] = list[pos -1];
                pos--;
            }
            list[pos] = x;
            System.out.println("Lần thứ" +i +": "+ Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        int[] array = {9,5,3,4,6,1,8};
        System.out.println(array);
        insertSort(array);
        System.out.println(array);
    }
}
