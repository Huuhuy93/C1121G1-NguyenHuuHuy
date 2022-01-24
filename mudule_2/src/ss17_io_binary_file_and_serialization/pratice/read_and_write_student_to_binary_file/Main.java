package ss17_io_binary_file_and_serialization.pratice.read_and_write_student_to_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StudentBinary> students = new ArrayList<>();
        students.add(new StudentBinary(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new StudentBinary(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new StudentBinary(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new StudentBinary(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new StudentBinary(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        writeToFile("src/ss17_io_binary_file_and_serializatio" +
                "n/pratice/read_and_write_student_to_binary_file/student.txt",students);
        List<StudentBinary> studentBinaries = readDataFromToFile("src/ss17_io_binary_file_and_serialization" +
                "/pratice/read_and_write_student_to_binary_file/student.txt");
        for (StudentBinary student : studentBinaries){
            System.out.println(student);
        }


    }

    public static void writeToFile(String path, List<StudentBinary> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<StudentBinary> readDataFromToFile(String path) {
        List<StudentBinary> students = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            students = (List<StudentBinary>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }
}
