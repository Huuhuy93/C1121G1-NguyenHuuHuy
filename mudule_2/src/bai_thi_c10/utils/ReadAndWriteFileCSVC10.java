package bai_thi_c10.utils;

import bai_thi_c10.models.SanPham;
import bai_thi_c10.models.SanPhamNhapKhau;
import bai_thi_c10.models.SanPhamXuatKhau;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCSVC10 {
    public static List<String> readFileCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        FileReader fileReader;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stringList;
    }

    public static void writeFileCSV(String pathFile, List<String> stringList, boolean append) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(pathFile, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static List<SanPham> convertStringListToSanPhamList(List<String> stringList) {
        List<SanPham> sanPhamList = new ArrayList<>();
        String[] array;
        SanPham.setSoSanPham(1);
        for (String string : stringList) {
            array = string.split(",");

            if (array.length == 9) {
                SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(array[1], array[2],
                        Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5],
                        Double.parseDouble(array[6]), array[7], Double.parseDouble(array[8]));

                sanPhamNhapKhau.setIdSanPham(Integer.parseInt(array[0]));
                sanPhamList.add(sanPhamNhapKhau);
            } else {
                SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(array[1], array[2],
                        Double.parseDouble(array[3]), Integer.parseInt(array[4]), array[5],
                        Double.parseDouble(array[6]), array[7]);
                sanPhamXuatKhau.setIdSanPham(Integer.parseInt(array[0]));
                sanPhamList.add(sanPhamXuatKhau);
            }
        }

        return sanPhamList;
    }

    public static List<String> convertSanPhamListToStringList(List<SanPham> sanPhamList) {
        List<String> stringList = new ArrayList<>();
        for (SanPham sanPham : sanPhamList) {
            stringList.add(sanPham.toStringToFileCSV());
        }
        return stringList;
    }
}
