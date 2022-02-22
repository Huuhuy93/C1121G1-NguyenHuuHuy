package furama_resort.utils;

import furama_resort.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStringToCSV {
    public static void write(List<String> stringList, String pathFile, boolean append) {
        File file = new File(pathFile);

        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    public static List<String> read(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public <T> List<String> changeToStringList(List<T> list) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Person) {
                stringList.add(((Person) list.get(i)).getInfo());
            }
//            if (list.get(i) instanceof Facility) {
//                if (list.get(i) instanceof VillaRental) {
//                    stringList.add(((VillaRental) list.get(i)).getInfoVilla());
//                }
//            }

            if (list.get(i) instanceof Facility) {
                stringList.add(((Facility) list.get(i)).getInfoFacility());
            }

            if (list.get(i) instanceof Booking) {
                stringList.add(((Booking) list.get(i)).getInfoBooking());
            }
            if (list.get(i) instanceof Contract) {
                stringList.add(((Contract) list.get(i)).getInfoContract());
            }
        }
        return stringList;
    }
}
