package ss3_array_and_method_in_java.practice;

import java.util.Scanner;

public class FindValueArray {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna"
                , "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name’s student:");
        String inputName = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(inputName)){
                System.out.println("Position of the students in the list " + inputName + " is: " + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found : " + inputName + " in the list.");
        }
    }
}
