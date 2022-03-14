package controller;

import model.Product;
import service.ProductService;
import service.impl.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private final ProductService productService = new ProductServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                updateProduct(request,response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            default:
                break;
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String nameProduct = request.getParameter("nameProduct");
        String description = request.getParameter("description");
        Integer priceProduct = Integer.valueOf(request.getParameter("priceProduct"));
        Integer id = (int) (Math.random() * 10000);

        Product product = new Product(id, nameProduct, description, priceProduct);
        this.productService.save(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product_jsp/create.jsp");
        request.setAttribute("message", "New product was created");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String nameProduct = request.getParameter("nameProduct");
        String description = request.getParameter("description");
        Integer priceProduct = Integer.valueOf(request.getParameter("priceProduct"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            product.setNameProduct(nameProduct);
            product.setDescription(description);
            product.setPriceProduct(priceProduct);
            this.productService.update(id, product);
            request.setAttribute("product", product);
            request.setAttribute("message", "Product information was updated");
            dispatcher = request.getRequestDispatcher("product_jsp/edit.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
