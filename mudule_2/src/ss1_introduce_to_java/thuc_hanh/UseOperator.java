package ss1_introduce_to_java.thuc_hanh;


import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
        float width;
        float heigh;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner
        System.out.println("Enter width:");
        width = scanner.nextFloat();
        System.out.println("Enter heigh:");
        heigh = scanner.nextFloat();
        float area = width * heigh;
        System.out.println("Area is : "+area);
    }
}
