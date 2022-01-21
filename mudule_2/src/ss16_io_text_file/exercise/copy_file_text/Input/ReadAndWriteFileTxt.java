package ss16_io_text_file.exercise.copy_file_text.Input;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileTxt {

    public List<StudentIO> readFile(String filePath) {
        List<StudentIO> students = new ArrayList<>();

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(filePath);

            int character;
            String temp = "";
            while ((character = fileReader.read())!= -1) {
                temp += (char)character;

            }
            String[] strings = temp.split("\n");
            for (int i = 0; i < strings.length; i++) {
                strings[i] = strings[i].replaceAll("\r","");
                String[] strings1 = strings[i].split(",");
                StudentIO student = new StudentIO();
                student.setName(strings1[0]);
                student.setAge(Integer.parseInt(strings1[1]));
                students.add(student);
            }
            for (StudentIO studentIO : students) {
                System.out.println(studentIO);
            }

        } catch (IOException e) {
            System.out.println("File này không tồn tại hoặc nội dung có lỗi");
        }

        return students;
    }

    public void writeFile(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(new StudentIO().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
