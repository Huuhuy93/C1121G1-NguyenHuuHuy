package ss15_handle_exception_and_debug.practice.array_index_out_of_bounds_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException array = new ArrayIndexOutOfBoundsException();
        Integer[] arr = array.creatRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n"+"Nhập chỉ số của 1 phần tử bất kì :");
        int index = Integer.parseInt(sc.nextLine());

        try {
            System.out.println("Giá trị của phần tử có chỉ số "+index+" là :"+arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
