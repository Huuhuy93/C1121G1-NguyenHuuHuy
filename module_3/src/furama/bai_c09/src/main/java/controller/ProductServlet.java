package controller;

import model.Catalogue;
import model.Product;
import model.ProductDTO;
import service.IProductService;
import service.impl.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    IProductService iProductService = new ProductService();

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
                    showNewProductForm(request, response);
                    break;
                case "edit":
                    showEditProductForm(request, response);
                    break;
//                case "sortByName":
//                    sortByName(request, response);
//                    break;
                default:
                    listProductDTO(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
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
                    insertProduct(request, response);
                    break;
                case "edit":
                    updateProduct(request, response);
                    break;
                case "delete":
                    deleteProduct(request, response);
                    break;
                case "searchByName":
                    searchByName(request, response);
                    break;
                case "searchByPrice":
                    searchByPrice(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }



    private void searchByName(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
        String searchName = request.getParameter("nameForSearch");
        List<ProductDTO> productDTOList = iProductService.searchByName(searchName);
        request.setAttribute("productDTOList", productDTOList);
//        có 2 cách: cách1 search trực tiếp trong trag list/ cách 2 : tạo 1 trang jsp riêng
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchByPrice(HttpServletRequest request, HttpServletResponse response) {

        Double searchPrice = Double.valueOf(request.getParameter("priceForSearch"));
        List<ProductDTO> productDTOList = iProductService.searchByPrice(searchPrice);
        request.setAttribute("productDTOList", productDTOList);
//        có 2 cách: cách1 search trực tiếp trong trag list/ cách 2 : tạo 1 trang jsp riêng
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {

        Integer id = Integer.parseInt(request.getParameter("id"));
        iProductService.deleteProduct(id);

        List<ProductDTO> productDTOList = iProductService.selectALLProductWithDTO();
        request.setAttribute("productDTOList", productDTOList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException {

        Integer idProduct = Integer.valueOf(request.getParameter("id"));
        String nameProduct = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
        Integer quantity = Integer.valueOf(request.getParameter("quantity"));
        String color = request.getParameter("color");
        Integer idCatalogue = Integer.valueOf(request.getParameter("id_catalogue"));

        Product product = new Product(idProduct, nameProduct, price, quantity, color, idCatalogue);
        iProductService.updateProduct(product);

        request.setAttribute("product", product);
        request.setAttribute("message", "Customer information was updated!!!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void insertProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {

        String nameProduct = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
        Integer quantity = Integer.valueOf(request.getParameter("quantity"));
        String color = request.getParameter("color");
        Integer idCatalogue = Integer.valueOf(request.getParameter("id_catalogue"));

        Product product = new Product(nameProduct, price, quantity, color, idCatalogue);
        this.iProductService.insertProduct(product);

        try {
//            sau khi them moi se quay ve trang list
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void listProductDTO(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
        List<ProductDTO> productDTOList = iProductService.selectALLProductWithDTO();
        request.setAttribute("productDTOList", productDTOList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showEditProductForm(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        Product product = iProductService.selectProduct(id);
        request.setAttribute("product", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showNewProductForm(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {

        List<Catalogue> catalogueList = iProductService.getAllCatalogue();
        request.setAttribute("catalogueList",catalogueList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
