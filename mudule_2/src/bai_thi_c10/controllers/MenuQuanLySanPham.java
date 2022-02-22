package bai_thi_c10.controllers;

import bai_thi_c10.models.services.SanPhamServiceImpl;
import bai_thi_c10.utils.NotFoundProductException;

import java.util.Scanner;

public class MenuQuanLySanPham {
    public void displayQuanLySanPham() {
        Scanner sc = new Scanner(System.in);
        SanPhamServiceImpl sanPhamService = new SanPhamServiceImpl();
        QLSP:
        do {
            try {
                System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM –\n" +
                        "Chọn chức năng theo số (để tiếp tục):\n" +
                        "1. Thêm mới\n" +
                        "2. Xóa\n" +
                        "3. Xem danh sách các sản phẩm\n" +
                        "4. Tìm kiếm\n" +
                        "5. Thoát\n");
                System.out.print("Chọn chức năng: ");
                int chosee = Integer.parseInt(sc.nextLine());
                switch (chosee) {
                    case 1:
                        chonSanPham:
                        do {
                            System.out.println("Chọn loại sản phẩm cần thêm mới:");
                            System.out.println("1. Sản phẩm nhập khẩu");
                            System.out.println("2. Sản phẩm xuất khẩu");
                            System.out.println("3. Quay lại Quản lý sản phẩm");
                            System.out.print("Chọn sản phẩm: ");
                            int choseeProduct = Integer.parseInt(sc.nextLine());
                            switch (choseeProduct) {
                                case 1:
                                    sanPhamService.themMoi(1);
                                    break;
                                case 2:
                                    sanPhamService.themMoi(2);
                                    break;
                                case 3:
                                    break chonSanPham;
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
                        sanPhamService.hienThi();
                        break;
                    case 4:
                        sanPhamService.findAll();
                        break;
                    case 5:
                        break QLSP;
                    default:
                        System.out.println("Nhập sai!!! Hãy nhập lại!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng! Hãy nhập lại!");
            }
        } while (true);
    }
}
