package controller;

import model.Customer;
import model.CustomerDTO;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    ICustomerService iCustomerService = new CustomerService();

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
                case "createCustomer":
                    showNewCustomerForm(request, response);
                    break;
                case "editCustomer":
                    showEditCustomerForm(request, response);
                    break;
                default:
                    listCustomerDTO(request, response);
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
                case "createCustomer":
                    insertCustomer(request, response);
                    break;
                case "editCustomer":
                    updateCustomer(request, response);
                    break;
                case "deleteCustomer":
                    deleteCustomer(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }


    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
        Integer customerId = Integer.valueOf(request.getParameter("id"));
        String customerName = request.getParameter("name");
        String customerBirthday = request.getParameter("birthday");
        Integer customerGender = Integer.valueOf(request.getParameter("gender"));
        String customerIdCard = request.getParameter("id_card");
        String customerPhone = request.getParameter("phone");
        String customerEmail = request.getParameter("email");
        String customerAddress = request.getParameter("address");
        Integer customerTypeId = Integer.valueOf(request.getParameter("type_id"));

        Customer customer = new Customer(customerId, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress, customerTypeId);
        iCustomerService.updateCustomer(customer);

        request.setAttribute("customer", customer);
        request.setAttribute("message", "Customer information was updated!!!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit_customer.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
        String customerName = request.getParameter("name");
        String customerBirthday = request.getParameter("birthday");
        Integer customerGender = Integer.valueOf(request.getParameter("gender"));
        String customerIdCard = request.getParameter("id_card");
        String customerPhone = request.getParameter("phone");
        String customerEmail = request.getParameter("email");
        String customerAddress = request.getParameter("address");
        Integer customerTypeId = Integer.valueOf(request.getParameter("type_id"));

        Customer customer = new Customer(customerName, customerBirthday, customerGender, customerIdCard, customerPhone,
                customerEmail, customerAddress, customerTypeId);
        this.iCustomerService.insertCustomer(customer);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create_customer.jsp");
        request.setAttribute("message", "New customer was created");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void listCustomerDTO(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
        List<CustomerDTO> customerDTOList = iCustomerService.selectALLCustomerWithDTO();
        request.setAttribute("customerDTOList", customerDTOList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list_customer.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        iCustomerService.deleteCustomer(id);

        List<CustomerDTO> customerDTOList = iCustomerService.selectALLCustomerWithDTO();
        request.setAttribute("customerDTOList", customerDTOList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list_customer.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    //        or làm cách 2 :trả về trang customer chỉ làm 1 dòng duy nhất mà bỏ dòng 147 - 158
//        response.sendRedirect("/customer");


    private void showEditCustomerForm(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        Customer customer = iCustomerService.selectCustomer(id);
        request.setAttribute("customer", customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit_customer.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showNewCustomerForm(HttpServletRequest request, HttpServletResponse response) throws SQLException,
            ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create_customer.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
