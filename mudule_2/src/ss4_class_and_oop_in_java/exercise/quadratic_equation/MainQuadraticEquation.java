package ss4_class_and_oop_in_java.exercise.quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = sc.nextDouble();
        System.out.println("Enter b :");
        double b = sc.nextDouble();
        System.out.println("Enter c :");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has 2 roots :" +quadraticEquation.getRoot1()+
                    " and "+quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no real roots");
        } else {
            System.out.println("The equation has 1 root :" +quadraticEquation.getDoubleRoot());
        }
    }
}
