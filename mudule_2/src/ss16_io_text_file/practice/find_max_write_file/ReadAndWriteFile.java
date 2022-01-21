package ss16_io_text_file.practice.find_max_write_file;

import javax.print.attribute.standard.Fidelity;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            line = bufferedReader.readLine();

            while (line != null) {
                numbers.add(Integer.parseInt(line));
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }


        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: "+max);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
