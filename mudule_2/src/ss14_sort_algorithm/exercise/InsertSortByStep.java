package ss14_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] list = new int[size];
        System.out.println("Nhập "+list.length+" giá trị của mảng :");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập là : ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        insertSortByStep(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println("Mảng sau khi đã sắp xếp là : "+list[i] + "\t");
        }

    }

    public static void insertSortByStep( int[] list) {
        int x;
        int pos;
        for (int i = 1; i < list.length ; i++) {
            x= list[i];
            pos = i;
            while (0 < pos && x < list[pos - 1]) {
                System.out.println("hoán đổi "+list[pos]+" với "+list[pos-1]);
                list[pos] = list[pos -1];
                pos--;
            }
            list[pos] = x;
            System.out.println("Lần thứ" +i +": "+ Arrays.toString(list));
        }

    }
}
