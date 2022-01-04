package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the triangle");
            System.out.println("2. Print the square triangle (The corner is square" +
                    " at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the triangle");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle (The corner is square" +
                            " at 4 different angles: top-left, top-right, botton-left, botton-right)");

                    System.out.println("The square triangle at botton-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }

                    System.out.println("The square triangle at top-left");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }

                    System.out.println("The square triangle at botton-right");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j <= 5 - i) {
                                System.out.print(" "+" ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.print("\n");
                    }
                    System.out.println("The square triangle at botton-left");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= 5; j++) {
                            if (j <= 5 - i) {
                                System.out.print(" "+" ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("3. Print isosceles triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j <= 5 - i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
