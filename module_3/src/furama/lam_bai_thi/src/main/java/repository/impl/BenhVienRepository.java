package repository.impl;

import model.BenhAn;
import model.BenhNhan;
import model.BenhAnDTO;
import repository.BaseBenhVienRepository;
import repository.IBenhVienRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhVienRepository implements IBenhVienRepository {

    private static final String INSERT_BENH_AN_SQL = "INSERT INTO benh_an (ma_benh_an, ma_benh_nhan, " +
            " ngay_nhap_vien, ngay_ra_vien, ly_do_nhap_vien) VALUES (?, ?, ?, ?, ?);";
    private static final String SELECT_BENH_AN_BY_ID = "select id_benh_an, ma_benh_an, ma_benh_nhan ,ngay_nhap_vien, " +
            " ngay_ra_vien, ly_do_nhap_vien from benh_an where id_benh_an =?;";
    private static final String SELECT_ALL_BENH_AN = "select * from benh_an;";

    private static final String SELECT_ALL_BENH_NHAN = "select * from benh_nhan;";

    private static final String SELECT_ALL_BENH_AN_JOIN_BENH_NHAN = "select benh_an.id_benh_an, benh_an.ma_benh_an, benh_nhan.ma_benh_nhan, benh_nhan.ten_benh_nhan, benh_an.ngay_nhap_vien, benh_an.ngay_ra_vien, benh_an.ly_do_nhap_vien\n" +
            "            from benh_an join benh_nhan on benh_an.ma_benh_nhan = benh_nhan.ma_benh_nhan\n" +
            "            order by id_benh_an;";

    private static final String DELETE_BENH_AN_SQL = "delete from benh_an where id_benh_an = ?;";
    private static final String UPDATE_BENH_AN_SQL = "update benh_an set ma_benh_an = ?,ma_benh_nhan= ?, " +
            " ngay_nhap_vien =?, ngay_ra_vien =?, ly_do_nhap_vien =? " +
            " where id_benh_an = ?;";

    private BaseBenhVienRepository baseBenhVienRepository = new BaseBenhVienRepository();



    @Override
    public void insertBenhAn(BenhAn benhAn) throws SQLException {
        Connection connection = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BENH_AN_SQL);
            preparedStatement.setString(1, benhAn.getMaBenhAn());
            preparedStatement.setString(2, benhAn.getMaBenhNhan());
            preparedStatement.setString(3, benhAn.getNgayNhapVien());
            preparedStatement.setString(4, benhAn.getNgayRaVien());
            preparedStatement.setString(5, benhAn.getLyDoNhapVien());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    @Override
    public BenhAn selectBenhAn(Integer idBenhAn) {
        BenhAn benhAn = null;
        Connection connection = null;

        try {
            connection = baseBenhVienRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BENH_AN_BY_ID);
            preparedStatement.setInt(1, idBenhAn);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maBenhAn = resultSet.getString("ma_benh_an");
                String maBenhNhan = resultSet.getString("ma_benh_nhan");
                String ngayNhapVien = resultSet.getString("ngay_nhap_vien");
                String ngayRaVien = resultSet.getString("ngay_ra_vien");
                String lyDoNhapVien = resultSet.getString("ly_do_nhap_vien");

                benhAn = new BenhAn(maBenhAn, maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return benhAn;
    }

    @Override
    public List<BenhAn> selectAllBenhAn() {
        List<BenhAn> benhAns = new ArrayList<>();
        Connection connection = null;

        try {
            connection = baseBenhVienRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BENH_AN);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer idBenhAn = resultSet.getInt("id_benh_an");
                String maBenhAn = resultSet.getString("ma_benh_an");
                String maBenhNhan = resultSet.getString("ma_benh_nhan");
                String ngayNhapVien = resultSet.getString("ngay_nhap_vien");
                String ngayRaVien = resultSet.getString("ngay_ra_vien");
                String lyDoNhapVien = resultSet.getString("ly_do_nhap_vien");
                benhAns.add(new BenhAn(maBenhAn, maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return benhAns;
    }

    @Override
    public boolean deleteBenhAn(Integer idBenhAn) throws SQLException {
        boolean rowDelete = false;
        Connection connection = null;
        try {
            connection = baseBenhVienRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BENH_AN_SQL);
            preparedStatement.setInt(1, idBenhAn);
            rowDelete = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return rowDelete;
    }

    @Override
    public boolean updateBenhAn(BenhAn benhAn) throws SQLException {
        boolean rowUpdate = false;
        Connection connection = null;
        try {
            connection = baseBenhVienRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BENH_AN_SQL);
            preparedStatement.setString(1, benhAn.getMaBenhAn());
            preparedStatement.setString(2, benhAn.getMaBenhNhan());
            preparedStatement.setString(3, benhAn.getNgayNhapVien());
            preparedStatement.setString(4, benhAn.getNgayRaVien());
            preparedStatement.setString(5, benhAn.getLyDoNhapVien());

            rowUpdate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return rowUpdate;
    }

    @Override
    public List<BenhAnDTO> selectAllBenhAnDTO() {
        List<BenhAnDTO> benhAnDTOList = new ArrayList<>();
        Connection connection = null;

        try {
            connection = baseBenhVienRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BENH_AN_JOIN_BENH_NHAN);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer idBenhAn = resultSet.getInt("id_benh_an");
                String maBenhAn = resultSet.getString("ma_benh_an");
                String maBenhNhan = resultSet.getString("ma_benh_nhan");
                String tenBenhNhan = resultSet.getString("ten_benh_nhan");
                String ngayNhapVien = resultSet.getString("ngay_nhap_vien");
                String ngayRaVien = resultSet.getString("ngay_ra_vien");
                String lyDoNhapVien = resultSet.getString("ly_do_nhap_vien");
                benhAnDTOList.add(new BenhAnDTO(idBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien,
                        ngayRaVien, lyDoNhapVien));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return benhAnDTOList;
    }

    @Override
    public List<BenhNhan> getAllBenhNhan() {

        List<BenhNhan> benhNhanList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = baseBenhVienRepository.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BENH_NHAN);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Integer idBenhNhan = resultSet.getInt("id_benh_nhan");
                String maBenhNhan = resultSet.getString("ma_benh_nhan");
                String tenBenhNhan = resultSet.getString("ten_benh_nhan");
                BenhNhan benhNhan = new BenhNhan(idBenhNhan, maBenhNhan, tenBenhNhan);
                benhNhanList.add(benhNhan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return benhNhanList;
    }

}
