package bai_thi_c10.models.services;

import bai_thi_c10.utils.NotFoundProductException;

public interface ISanPhamService {
    void themMoi(int number);
    void hienThi();
    void findAll();
    void xoa() throws NotFoundProductException;
}
