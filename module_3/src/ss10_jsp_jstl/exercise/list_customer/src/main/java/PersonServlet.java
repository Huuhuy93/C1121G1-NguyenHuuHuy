import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PersonServlet", value = "/person")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person(1, "Mai Văn Hoàng", "1983", "Hà Nội", "http://icdn.dantri.com.vn/zoom/1200_630/2019/12/03/ha-1-1575358052521.jpg");
        Person person2 = new Person(2, "Nguyễn Văn Nam", "1990", "Hà Nội", "https://photo-cms-sggp.zadn.vn/w580/Uploaded/2022/evesfnbfjpy/2021_05_30/cn3trochuyen_iajq.jpg");
        Person person3 = new Person(3, "Nguyễn Thái Hòa", "1983", "Hà Nội", "https://baoquocte.vn/stores/news_dataimages/phamthuan/062019/14/09/in_article/dien-vien-bao-thanh-lam-nghe-thuat-la-phai-that-tha_4.jpg");
        Person person4 = new Person(4, "Lê Mai Nguyên", "1999", "Hà Nội", "https://truenewz24.com/wp-content/uploads/2021/05/dvs1.png");
        Person person5 = new Person(5, "Mai Văn Ngọc", "2000", "Hà Nội", "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2021/07/son-ye-jin-actor.jpg?fit=700%2C20000&quality=95&ssl=1");

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        request.setAttribute("list1", list);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
