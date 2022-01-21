package ss16_io_text_file.exercise.copy_file_text.Input;

import ss16_io_text_file.practice.find_max_write_file.ReadAndWriteFile;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFileTxt readAndWriteFileTxt = new ReadAndWriteFileTxt();
        List<StudentIO> studentIOList = readAndWriteFileTxt.readFile("src/ss16_io_text_file/exercise" +
                "/copy_file_text/Input/Input.txt");
        readAndWriteFileTxt.writeFile("src/ss16_io_text_file/exercise/copy_file_text/Input/Output.txt");
    }
}
