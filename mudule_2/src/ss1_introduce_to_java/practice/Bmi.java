package ss1_introduce_to_java.practice;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weigh, heigh, bmi;
        System.out.print("Enter your weigh (in kilogram) :");
        weigh = scanner.nextDouble();
        System.out.print("Enter your heigh (in meter) :");
        heigh = scanner.nextDouble();
        bmi = weigh / Math.pow(heigh, 2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
