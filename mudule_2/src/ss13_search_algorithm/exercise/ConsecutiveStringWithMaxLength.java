package ss13_search_algorithm.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsecutiveStringWithMaxLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kì :");
        String inputString = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < inputString.length(); i++) {
            if (list.size() > 1 && inputString.charAt(i) <= list.getLast() &&
            list.contains(inputString.charAt(i))) {
                list.clear();
            }

            list.add(inputString.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        System.out.println(max);
    }
}
