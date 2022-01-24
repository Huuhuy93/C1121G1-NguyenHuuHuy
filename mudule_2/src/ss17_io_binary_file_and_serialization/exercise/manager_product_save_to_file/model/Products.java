package ss17_io_binary_file_and_serialization.exercise.manager_product_save_to_file.model;

import java.io.Serializable;

public class Products implements Serializable {
    private String maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private int giaSanPham;
    private String moTaKhac;

    public Products() {
    }

    public Products(String maSanPham, String tenSanPham, String hangSanXuat, int giaSanPham, String moTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.giaSanPham = giaSanPham;
        this.moTaKhac = moTaKhac;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(int giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getMoTaKhac() {
        return moTaKhac;
    }

    public void setMoTaKhac(String moTaKhac) {
        this.moTaKhac = moTaKhac;
    }

    @Override
    public String toString() {
        return "Products{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", giaSanPham=" + giaSanPham +
                ", moTaKhac='" + moTaKhac + '\'' +
                '}';
    }
}
