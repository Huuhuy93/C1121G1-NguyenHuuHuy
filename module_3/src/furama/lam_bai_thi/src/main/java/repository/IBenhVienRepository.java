package repository;

import model.BenhAn;
import model.BenhAnDTO;
import model.BenhNhan;

import java.sql.SQLException;
import java.util.List;

public interface IBenhVienRepository {
    public void insertBenhAn(BenhAn benhAn) throws SQLException;

    public BenhAn selectBenhAn(Integer idBenhAn);

    public List<BenhAn> selectAllBenhAn();

    public boolean deleteBenhAn(Integer idBenhAn) throws SQLException;

    public boolean updateBenhAn(BenhAn benhAn) throws SQLException;

    public List<BenhAnDTO> selectAllBenhAnDTO();

    public List<BenhNhan> getAllBenhNhan();
}
