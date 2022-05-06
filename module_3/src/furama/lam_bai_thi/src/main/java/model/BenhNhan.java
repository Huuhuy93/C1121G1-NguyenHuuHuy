package model;

public class BenhNhan {
    Integer idBenhNhan;
    String maBenhNhan;
    String tenBenhNhan;

    public BenhNhan() {
    }

    public BenhNhan(Integer idBenhNhan, String maBenhNhan, String tenBenhNhan) {
        this.idBenhNhan = idBenhNhan;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
    }

    public Integer getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(Integer idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }
}
