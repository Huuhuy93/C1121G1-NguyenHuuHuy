package ss1_introduce_to_java.bai_tap;

import java.util.Scanner;

public class ConvertNumbersIntoWords {
    public static String unit(int number) {
        String string = "";
        switch (number) {
            case 0:
                string += "zero";
                break;
            case 1:
                string += "one";
                break;
            case 2:
                string += "two";
                break;
            case 3:
                string += "three";
                break;
            case 4:
                string += "four";
                break;
            case 5:
                string += "five";
                break;
            case 6:
                string += "six";
                break;
            case 7:
                string += "seven";
                break;
            case 8:
                string += "eight";
                break;
            case 9:
                string += "nine";
                break;
            case 10:
                string += "ten";
                break;
        }
        return string;
    }

    public static String dozens1(int number) {
        String string2 = "";
        switch (number) {
            case 11:
                string2 += "eleven";
                break;
            case 12:
                string2 += "twelve";
                break;
            case 13:
                string2 += "thirteen";
                break;
            case 14:
                string2 += "fourteen";
                break;
            case 15:
                string2 += "fifteen";
                break;
            case 16:
                string2 += "sixteen";
                break;
            case 17:
                string2 += "seventeen";
                break;
            case 18:
                string2 += "eighteen";
                break;
            case 19:
                string2 += "nineteen";
                break;
        }
        return string2;
    }

    public static String dozens2(int number) {
        String string3 = "";
        int odd = (number%10);//khai báo lấy phần lẻ
        int even = number - odd;//khai báo lấy phần chẵn
        String oddNumber = unit(odd);//gọi phần lẻ ở hàm hàng đơn vị
        switch (even) {
            case 20:
                string3 += "twenty";
                break;
            case 30:
                string3 += "thirty";
                break;
            case 40:
                string3 += "forty";
                break;
            case 50:
                string3 += "fifty";
                break;
            case 60:
                string3 += "sixty";
                break;
            case 70:
                string3 += "seventy";
                break;
            case 80:
                string3 += "eighty";
                break;
            case 90:
                string3 += "ninety";
                break;
        }
        string3 +=" " + oddNumber;
        return string3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = Integer.parseInt(sc.nextLine());
        if (num <= 10) {
            System.out.println(unit(num));
        } else if (num < 20) {
            System.out.println(dozens1(num));
        } else if (num < 100) {
            System.out.println(dozens2(num));
        }
    }
}
