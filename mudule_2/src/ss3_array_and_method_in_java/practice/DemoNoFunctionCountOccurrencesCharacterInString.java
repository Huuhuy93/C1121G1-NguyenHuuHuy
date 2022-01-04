package ss3_array_and_method_in_java.practice;

import java.util.Scanner;

public class DemoNoFunctionCountOccurrencesCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        char character;
        System.out.println("Enter a string :");
        string = sc.nextLine();
        System.out.println("The string entered is : "+string);
        System.out.println("The character want count :");
        character = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count ++;
            }
        }
        System.out.println("Count Occurrences Character "+character+ " In String is :"+count);
    }
}
