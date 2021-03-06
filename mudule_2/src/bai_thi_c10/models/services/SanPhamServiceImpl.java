package bai_thi_c10.models.services;

import bai_thi_c10.models.SanPham;
import bai_thi_c10.models.SanPhamNhapKhau;
import bai_thi_c10.models.SanPhamXuatKhau;
import bai_thi_c10.utils.NotFoundProductException;
import bai_thi_c10.utils.ReadAndWriteFileCSVC10;
import bai_thi_c10.utils.ValidationC10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamServiceImpl implements ISanPhamService{
    static final String SAN_PHAM = "src\\bai_thi_c10\\data\\sanPham.csv";
    ValidationC10 validationC10 = new ValidationC10();

    @Override
    public void themMoi(int number) {
        String maSanPham = validationC10.resultString("Nhập mã sản phẩm: ");
        String tenSanPham = validationC10.resultString("Nhập tên sản phẩm: ");
        double giaBan = validationC10.resultDouble("Nhập giá bán: ");
        int soLuong = validationC10.resultInt("Nhập số lượng: ");
        String nhaSanXuat = validationC10.resultString("Nhập nhà sản xuất: ");

        List<SanPham> sanPhamNhapKhauList = new ArrayList<>();
        List<SanPham> sanPhamXuatKhauList = new ArrayList<>();
        List<String> stringNhapKhauList;
        List<String> stringXuatKhauList;

        switch (number) {
            case 1:
                double giaNhapKhau = validationC10.resultDouble("Nhập giá nhập khẩu: ");
                String tinhThanhNhap = validationC10.resultString("Nhập tỉnh thành nhập: ");
                double thueNhapKhau = validationC10.resultDouble("Nhập thuế nhập khẩu: ");

                sanPhamNhapKhauList.add(new SanPhamNhapKhau(maSanPham, tenSanPham, giaBan, soLuong
                ,nhaSanXuat, giaNhapKhau, tinhThanhNhap, thueNhapKhau));
                stringNhapKhauList = ReadAndWriteFileCSVC10.convertSanPhamListToStringList(sanPhamNhapKhauList);
                ReadAndWriteFileCSVC10.writeFileCSV(SAN_PHAM, stringNhapKhauList, true);
                System.out.println("Thêm mới sản phẩm nhập khẩu thành công!!!");
                break;

            case 2:
                double giaXuatKhau = validationC10.resultDouble("Nhập giá xuất khẩu: ");
                String quocGiaNhapSanPham = validationC10.resultString("Nhập quốc gia nhập sản phẩm: ");

                sanPhamXuatKhauList.add(new SanPhamXuatKhau(maSanPham, tenSanPham, giaBan, soLuong,
                        nhaSanXuat, giaXuatKhau, quocGiaNhapSanPham));
                stringXuatKhauList = ReadAndWriteFileCSVC10.convertSanPhamListToStringList(sanPhamXuatKhauList);
                ReadAndWriteFileCSVC10.writeFileCSV(SAN_PHAM, stringXuatKhauList, true);
                System.out.println("Thêm mới sản phẩm xuất khẩu thành công!!!");
                break;
        }

    }

    @Override
    public void hienThi() {
        List<String> stringList = ReadAndWriteFileCSVC10.readFileCSV(SAN_PHAM);
        List<SanPham> sanPhamList = ReadAndWriteFileCSVC10.convertStringListToSanPhamList(stringList);
        System.out.println("Danh sách sản phẩm: ");
        for (SanPham sanPham : sanPhamList) {
            System.out.println(sanPham);
        }
    }

    @Override
    public void findAll() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            hienThi();
            System.out.print("Chọn mã sản phẩm hoặc tên sản phẩm bạn muốn tìm: ");
            String timSanPham = scanner.nextLine();
            if (timSanPham.trim().equals("")) {
                System.out.println("Nhập sai!!! Hãy nhập lại!");
            } else {
                List<String> stringList = ReadAndWriteFileCSVC10.readFileCSV(SAN_PHAM);
                List<SanPham> sanPhamList = ReadAndWriteFileCSVC10.convertStringListToSanPhamList(stringList);
                boolean flag = false;

                for (SanPham sanPham : sanPhamList) {
                    if (sanPham.getMaSanPham().toLowerCase().contains(timSanPham.toLowerCase())
                            || sanPham.getTenSanPham().toLowerCase().contains(timSanPham.toLowerCase())) {
                        System.out.println(sanPham);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Không tìm thấy!!! Hãy nhập lại!!!");
                } else {
                    break;
                }
            }
        }

    }

    @Override
    public void xoa() throws NotFoundProductException {
        Scanner scanner = new Scanner(System.in);
        chonMaSanPham:
        while (true) {
            hienThi();
            System.out.print("Chọn mã sản phẩm muốn xoá: ");
            String maCanXoa = scanner.nextLine();
            if (maCanXoa.trim().equals("")) {
                System.out.println("Nhập sai!!! Hãy nhập lại!");
            } else {
                List<String> stringList = ReadAndWriteFileCSVC10.readFileCSV(SAN_PHAM);
                List<SanPham> sanPhamList = ReadAndWriteFileCSVC10.convertStringListToSanPhamList(stringList);
                boolean flag = false;
                for (SanPham sanPham : sanPhamList) {
                    if (sanPham.getMaSanPham().equals(maCanXoa)) {
                        do {
                            int xacNhan;
                            try {
                                System.out.println("Bạn có xác nhận xoá sản phẩm với mã sản phẩm là: " + maCanXoa);
                                System.out.println("1. Có");
                                System.out.println("2. Không");
                                System.out.print("Bạn chọn: ");
                                xacNhan = Integer.parseInt(scanner.nextLine());
                                switch (xacNhan) {
                                    case 1:
                                        sanPhamList.remove(sanPham);
                                        stringList = ReadAndWriteFileCSVC10.convertSanPhamListToStringList(sanPhamList);
                                        ReadAndWriteFileCSVC10.writeFileCSV(SAN_PHAM, stringList, false);
                                        System.out.println("Bạn đã xoá thành công!!!");
                                        break chonMaSanPham;
                                    case 2:
                                        System.out.println("Bạn đã huỷ xoá!");
                                        break chonMaSanPham;
                                    default:
                                        System.out.println("Bạn chọn sai!!! Hãy nhập lại!");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Nhập sai định dạng!!! Hãy nhập lại!");
                            }
                        } while (true);
                    }
                    else {
                        flag = true;
                    }
                }
                if (flag) {
                    throw new NotFoundProductException();
                }
            }
        }
    }

}
