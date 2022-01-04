package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class FindMaxElementInTwoWayArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float max = 0f;
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
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The max in matrix is : " +max);
    }
}
