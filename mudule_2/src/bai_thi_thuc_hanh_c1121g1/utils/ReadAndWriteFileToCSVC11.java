package bai_thi_thuc_hanh_c1121g1.utils;

import bai_thi_c10.models.SanPham;
import bai_thi_c10.models.SanPhamNhapKhau;
import bai_thi_c10.models.SanPhamXuatKhau;
import bai_thi_thuc_hanh_c1121g1.models.BenhAn;
import bai_thi_thuc_hanh_c1121g1.models.BenhAnThuong;
import bai_thi_thuc_hanh_c1121g1.models.BenhAnVip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileToCSVC11 {
    public static List<String> readFileToCSVC11(String pathFile) {
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

    public static void writeFileToCSVC11(String pathFile, List<String> stringList, boolean append) {
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

    public static List<BenhAn> convertStringListToBenhAnList(List<String> stringList) {
        List<BenhAn> benhAnList = new ArrayList<>();
        String[] array;
        BenhAn.setSoBenhAn(1);
        for (String string : stringList) {
            array = string.split(",");

            if (array.length == 8) {
                BenhAnThuong benhAnThuong = new BenhAnThuong(array[1], array[2], array[3], array[4],
                        array[5], array[6], Double.parseDouble(array[7]));

                benhAnThuong.setIdBenhAn(Integer.parseInt(array[0]));
                benhAnList.add(benhAnThuong);
            } else {
                BenhAnVip benhAnVip = new BenhAnVip(array[1], array[2], array[3], array[4],
                        array[5], array[6], array[7], array[8]);
                benhAnVip.setIdBenhAn(Integer.parseInt(array[0]));
                benhAnList.add(benhAnVip);
            }
        }

        return benhAnList;
    }

    public static List<String> convertBenhAnListToStringList(List<BenhAn> benhAnList) {
        List<String> stringList = new ArrayList<>();
        for (BenhAn benhAn : benhAnList) {
            stringList.add(benhAn.toStringToFileCSV());
        }
        return stringList;
    }
}
