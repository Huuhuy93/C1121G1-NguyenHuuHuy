package bai_thi_thuc_hanh_c1121g1.models;

public class BenhAnThuong extends BenhAn{
    double phiNamVien;

    public BenhAnThuong() {
    }

    public BenhAnThuong(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong(String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien,
                        String ngayRaVien, String lyDoNhapVien, double phiNamVien) {
        super(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "idBenhAn=" + idBenhAn +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", maBenhNhan='" + maBenhNhan + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                ", phiNamVien=" + phiNamVien +
                '}';
    }

    @Override
    public String toStringToFileCSV() {
        return super.toStringToFileCSV() + "," + phiNamVien;
    }
}
