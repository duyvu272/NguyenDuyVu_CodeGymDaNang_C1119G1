import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/discounta")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("descriptions");
        float  price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        float discountPrice  = price*discount*0.1f;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Description : "+description+"</h1>");
        writer.println("<h1> Price : "+price+"</h1>");
        writer.println("<h1> Discount : "+discount+"</h1>");
        writer.println("<h1> Value discount :"+discountPrice+"</h1>");

        writer.println("</html>");

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
