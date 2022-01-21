package ss16_io_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCsv {
    public static List<Country> readCountryCSV(String filePath) {
        List<Country> countryList = new ArrayList<>();
        File file = new File(filePath);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(","); // chuyển từ string sang mảng (để dễ xử lý dữ liệu)
                Country country = new Country(Integer.parseInt(array[0]),array[1],array[2]);
                countryList.add(country);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Lỗi đọc file");;
        }


        return countryList;
    }
}
