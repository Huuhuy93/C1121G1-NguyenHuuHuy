package bai_thi_thuc_hanh_c1121g1.controllers;

import bai_thi_c10.utils.NotFoundProductException;

import java.util.Scanner;

public class MenuQuanLyBenhVien {
    public void displayQuanLyBenhVien() {
        Scanner sc = new Scanner(System.in);

        QLBV:
        do {
            try {
                System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN BỆNH VIỆN –\n" +
                        "Chọn chức năng theo số (để tiếp tục):\n" +
                        "1. Thêm mới\n" +
                        "2. Xóa\n" +
                        "3. Xem danh sách các bệnh án\n" +
                        "4. Thoát\n");
                System.out.print("Chọn chức năng: ");
                int chosee = Integer.parseInt(sc.nextLine());

                switch (chosee) {
                    case 1:
                        chonChucNang:
                        do {
                            System.out.println("Chọn loại bệnh án cần thêm mới:");
                            System.out.println("1. Bệnh án thường");
                            System.out.println("2. Bệnh án VIP");
                            System.out.println("3. Quay lại Quản lý bệnh án");
                            System.out.print("Chọn bệnh án: ");
                            int choseeProduct = Integer.parseInt(sc.nextLine());
                            switch (choseeProduct) {
                                case 1:
                                    sanPhamService.themMoi(1);
                                    break;
                                case 2:
                                    sanPhamService.themMoi(2);
                                    break;
                                case 3:
                                    break chonChucNang;
                                default:
                                    System.out.println("Nhập sai!!! Hãy nhập lại!");
                            }
                        } while (true);
                        break;

                    case 2:
                        while (true) {
                            try {
                                sanPhamService.xoa();
                                break;
                            } catch (NotFoundProductException e) {
                                System.out.println("Không tìm thấy! Hãy nhập lại!");
                            }
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        break QLBV;
                    default:
                        System.out.println("Nhập sai!!! Hãy nhập lại!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng! Hãy nhập lại!");
            }
        } while (true);
    }
}
