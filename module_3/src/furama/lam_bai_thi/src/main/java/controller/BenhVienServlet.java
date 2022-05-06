package controller;

import model.BenhAn;
import model.BenhAnDTO;
import model.BenhNhan;
import service.IBenhVienService;
import service.impl.BenhVienService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "BenhVienServlet", value = "/benh_vien")
public class BenhVienServlet extends HttpServlet {

    IBenhVienService iBenhVienService = new BenhVienService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                    showNewBenhAnForm(request, response);
                    break;
                case "edit":
                    showEditBenhAnForm(request, response);
                    break;
//                case "sortByName":
//                    sortByName(request, response);
//                    break;
                default:
                    listBenhAnDTO(request, response);
                    break;
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                    insertBenhAn(request, response);
                    break;
                case "edit":
                    updateBenhAn(request, response);
                    break;
                case "delete":
                    deleteBenhAn(request, response);
                    break;
//                case "search":
//                    searchByName(request, response);
//                    break;
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }



    private void deleteBenhAn(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
    }


    private void updateBenhAn(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
    }


    private void insertBenhAn(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {

        String maBenhAn = request.getParameter("maBenhAn");
        String maBenhNhan = request.getParameter("maBenhNhan");
        String ngayNhapVien = request.getParameter("ngayNhapVien");
        String ngayRaVien = request.getParameter("ngayRaVien");
        String lyDoNhapVien = request.getParameter("lyDoNhapVien");

        BenhAn benhAn = new BenhAn(maBenhAn, maBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.iBenhVienService.insertBenhAn(benhAn);

        RequestDispatcher dispatcher = request.getRequestDispatcher("benh_vien/create.jsp");
        request.setAttribute("message", "Bệnh án mới đã được thêm");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void listBenhAnDTO(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {

        List<BenhAnDTO> benhAnDTOList = iBenhVienService.selectAllBenhAnDTO();
        request.setAttribute("benhAnDTOList", benhAnDTOList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("benh_vien/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showEditBenhAnForm(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
    }


    private void showNewBenhAnForm(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {

        List<BenhNhan> benhNhanList = iBenhVienService.getAllBenhNhan();
        request.setAttribute("benhNhanList", benhNhanList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("benh_vien/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
