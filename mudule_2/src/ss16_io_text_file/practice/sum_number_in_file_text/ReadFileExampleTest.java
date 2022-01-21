package ss16_io_text_file.practice.sum_number_in_file_text;

import java.util.Scanner;

public class ReadFileExampleTest {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
