package bai_thi_thuc_hanh_c1121g1.models.services;

import bai_thi_c10.models.SanPham;
import bai_thi_c10.utils.ReadAndWriteFileCSVC10;
import bai_thi_c10.utils.ValidationC10;
import bai_thi_thuc_hanh_c1121g1.models.BenhAn;
import bai_thi_thuc_hanh_c1121g1.models.BenhAnThuong;
import bai_thi_thuc_hanh_c1121g1.models.BenhAnVip;
import bai_thi_thuc_hanh_c1121g1.utils.NotFoundMedicalRecordException;
import bai_thi_thuc_hanh_c1121g1.utils.ReadAndWriteFileToCSVC11;
import bai_thi_thuc_hanh_c1121g1.utils.ValidationBenhAn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnServiceImpl implements IBenhAnService {
    static final String BENH_AN = "src\\bai_thi_thuc_hanh_c1121g1\\data\\medical_records.csv";
    ValidationBenhAn validationBenhAn = new ValidationBenhAn();

    @Override
    public void add(int number) {
        String maBenhAn = validationBenhAn.resultStringAfter("Nhập mã bệnh án : ");
        String maBenhNhan = validationBenhAn.resultStringAfter("Nhập mã bệnh nhân : ");
        String tenBenhNhan = validationBenhAn.resultStringAfter("Nhập tên bệnh nhân : ");
        String ngayNhapVien = validationBenhAn.resultStringAfter("Nhập Ngày nhập viện : ");
        String ngayRaVien = validationBenhAn.resultStringAfter("Nhập Ngày ra viện");
        String lyDoNhapVien = validationBenhAn.resultStringAfter("Nhập lý do ra viện : ");

        List<BenhAn> benhAnThuongList = new ArrayList<>();
        List<BenhAn> benhAnVipList = new ArrayList<>();
        List<String> stringbenhAnThuongList;
        List<String> stringbenhAnVipList;

        switch (number) {
            case 1:
                double phiNamVien = validationBenhAn.resultDoubleAfter("Nhập phí nằm viện : ");

                benhAnThuongList.add(new BenhAnThuong(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien,
                        ngayRaVien, lyDoNhapVien, phiNamVien));
                stringbenhAnThuongList = ReadAndWriteFileToCSVC11.convertBenhAnListToStringList(benhAnThuongList);
                ReadAndWriteFileToCSVC11.writeFileToCSVC11(BENH_AN, stringbenhAnThuongList, true);
                System.out.println("Thêm mới bệnh án thường thành công!!!");
                break;

            case 2:
                String loaiVip = validationBenhAn.resultStringAfter("Nhập loại VIP : ");
                String thoiHanVip = validationBenhAn.resultStringAfter("Nhập thời hạn VIP");

                benhAnVipList.add(new BenhAnVip(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien,
                        lyDoNhapVien, loaiVip, thoiHanVip));
                stringbenhAnVipList = ReadAndWriteFileToCSVC11.convertBenhAnListToStringList(benhAnVipList);
                ReadAndWriteFileToCSVC11.writeFileToCSVC11(BENH_AN, stringbenhAnVipList, true);
                break;
        }
    }

    @Override
    public void display() {
        List<String> stringList = ReadAndWriteFileToCSVC11.readFileToCSVC11(BENH_AN);
        List<BenhAn> benhAnList = ReadAndWriteFileToCSVC11.convertStringListToBenhAnList(stringList);
        System.out.println("Danh sách bệnh án: ");
        for (BenhAn benhAn : benhAnList) {
            System.out.println(benhAn);
        }
    }

    @Override
    public void delete() throws NotFoundMedicalRecordException {
        Scanner scanner = new Scanner(System.in);
        chonMaBenhAn:
        while (true) {
            display();
            System.out.println("Chọn mã bệnh án muốn xóa : ");
            String maCanXoa = scanner.nextLine();
            if (maCanXoa.trim().equals("")) {
                System.out.println("Nhập sai!!! Hãy nhập lại!");
            } else {
                List<String> stringList = ReadAndWriteFileToCSVC11.readFileToCSVC11(BENH_AN);
                List<BenhAn> benhAnList = ReadAndWriteFileToCSVC11.convertStringListToBenhAnList(stringList);
                boolean flag = false;
                for (BenhAn benhAn : benhAnList) {
                    if (benhAn.getMaBenhAn().equals(maCanXoa)) {
                        do {
                            int xacNhan;
                            try {
                                System.out.println("Bạn có xác nhận xoá bệnh án với mã bệnh án là: " + maCanXoa);
                                System.out.println("1. Có");
                                System.out.println("2. Không");
                                System.out.print("Bạn chọn: ");
                                xacNhan = Integer.parseInt(scanner.nextLine());
                                switch (xacNhan) {
                                    case 1:
                                        benhAnList.remove(benhAn);
                                        stringList = ReadAndWriteFileToCSVC11.convertBenhAnListToStringList(benhAnList);
                                        ReadAndWriteFileToCSVC11.writeFileToCSVC11(BENH_AN, stringList, false);
                                        System.out.println("Bạn đã xoá thành công!!!");
                                        break chonMaBenhAn;
                                    case 2:
                                        System.out.println("Bạn đã huỷ xoá!");
                                        break chonMaBenhAn;
                                    default:
                                        System.out.println("Bạn chọn sai!!! Hãy nhập lại!");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Nhập sai định dạng!!! Hãy nhập lại!");
                            }
                        } while (true);
                    } else {
                        flag = true;
                    }
                }
                if (flag) {
                    throw new NotFoundMedicalRecordException();
                }
            }
        }
    }
}
