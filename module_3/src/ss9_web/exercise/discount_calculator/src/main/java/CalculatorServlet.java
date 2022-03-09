import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/discount")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("list_price"));
        float percent = Float.parseFloat(request.getParameter("discount_percent"));

        float discount_amount = (float)(price * percent * 0.01);
        float discount_price = price - discount_amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>List Price: " + price + "</h1>");
        writer.println("<h1>Discount Percent: " + percent + "</h1>");
        writer.println("<h1>Discount Amount: " + discount_amount + "</h1>");
        writer.println("<h1>Discount Price: " + discount_price + "</h1>");

    }
}
