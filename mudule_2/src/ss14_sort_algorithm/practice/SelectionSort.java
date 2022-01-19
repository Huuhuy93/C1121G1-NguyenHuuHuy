package ss14_sort_algorithm.practice;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            //gán vị trí min cho i
            int minIndex = i;

            // tìm giá trị nhỏ nhất trong dãy hiện hành
            for (int j = i + 1; j < list.length; j++) {
                if (list[minIndex] > list[j]) {
                    list[minIndex] = list[j];
                    minIndex = j;
                }
            }

            // đổi chỗ giá trị nhỏ nhất và pt đầu tiên của dãy hiện hành.
            if (minIndex != i) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
            System.out.println("Lần thứ" +i +": "+ Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        int[] list = {9,5,3,4,2,1};
        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
