package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class CountOccurrencesCharacterInString {
    static void countCharacter(String string) {
        int count = 0;
        char character = 'a';
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count ++;
            }
        }
        System.out.println("Count Occurrences Character : "+character+ " in String is :"+count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        System.out.println("Enter a string :");
        string = sc.nextLine();
        System.out.println("The string entered is : "+string);
        countCharacter(string);
    }
}
