package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class SumTheNumbersAtDiagonalLineInMatrixSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // số dòng và cột của ma trận vuông.
        int sum = 0;
        do {
            System.out.println("Enter degree of square matrix :");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 0);
        int array[][] = new int[n][n];
        System.out.println("Enter element for square matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("array[" + i + "," + j + "] = ");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("matrix array is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        // các phần tử nằm trên đường chéo chính
        // là các phần tử có chỉ số dòng = chỉ số cột
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("The Sum of element at diagonal line in square matrix is : "+sum);
    }
}
