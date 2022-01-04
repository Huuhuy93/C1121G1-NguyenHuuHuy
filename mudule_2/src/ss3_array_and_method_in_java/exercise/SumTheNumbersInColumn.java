package ss3_array_and_method_in_java.exercise;

import javafx.scene.transform.Scale;
import ss3_array_and_method_in_java.practice.MaxInArray;

import java.util.Scanner;

public class SumTheNumbersInColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m; //số dòng của ma trận
        int n; //số cột của ma trận
        do {
            System.out.println("Enter the number of row of the matrix :");
            m = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the number of column of the matrix :");
            n = Integer.parseInt(sc.nextLine());
        } while (m < 1 || n < 1);
        int arr[][] = new int[m][n];
        System.out.println("Enter element for matrix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("arr[" + i + "," + j + "] = ");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("matrix arr is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int x; //số cột muốn tính tổng
        System.out.println("Enter column yoy want calulator sum :");
        x = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i][x];
            System.out.println("Sum of column is : "+sum);
        }
    }
}
