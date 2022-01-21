package ss16_io_text_file.exercise.read_file_csv;

import java.util.ArrayList;
import java.util.List;

public class MainCountry {
    public static void main(String[] args) {
        ReadAndWriteFileCsv readAndWriteFileCsv = new ReadAndWriteFileCsv();
        List<Country> countryList = readAndWriteFileCsv.readCountryCSV("src/ss16_io_text_" +
                "file/exercise/read_file_csv/Country.csv");
        for (Country country: countryList) {
            System.out.println(country.getName());
        }
    }
}
