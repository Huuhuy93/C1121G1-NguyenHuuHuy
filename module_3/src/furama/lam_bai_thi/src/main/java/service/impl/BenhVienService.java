package service.impl;

import model.BenhAn;
import model.BenhAnDTO;
import model.BenhNhan;
import repository.IBenhVienRepository;
import repository.impl.BenhVienRepository;
import service.IBenhVienService;

import java.sql.SQLException;
import java.util.List;

public class BenhVienService implements IBenhVienService {

    IBenhVienRepository iBenhVienRepository = new BenhVienRepository();

    @Override
    public void insertBenhAn(BenhAn benhAn) throws SQLException {
        iBenhVienRepository.insertBenhAn(benhAn);
    }

    @Override
    public BenhAn selectBenhAn(Integer idBenhAn) {
        return iBenhVienRepository.selectBenhAn(idBenhAn);
    }

    @Override
    public List<BenhAn> selectAllBenhAn() {
        return iBenhVienRepository.selectAllBenhAn();
    }

    @Override
    public boolean deleteBenhAn(Integer idBenhAn) throws SQLException {
        return iBenhVienRepository.deleteBenhAn(idBenhAn);
    }

    @Override
    public boolean updateBenhAn(BenhAn benhAn) throws SQLException {
        return iBenhVienRepository.updateBenhAn(benhAn);
    }

    @Override
    public List<BenhAnDTO> selectAllBenhAnDTO() {
        return iBenhVienRepository.selectAllBenhAnDTO();
    }

    @Override
    public List<BenhNhan> getAllBenhNhan() {
        return iBenhVienRepository.getAllBenhNhan();
    }
}
