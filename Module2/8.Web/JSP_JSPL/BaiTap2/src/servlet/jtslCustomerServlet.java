package servlet;

import customer_content.Customer;
import customer_content.DBUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "jtslCustomerServlet",urlPatterns = "/customer")
public class jtslCustomerServlet extends HttpServlet {
    private DBUtils dbUtils = new DBUtils();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Customer> list = dbUtils.querryEm();
        request.setAttribute("customers",list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/index.jsp");
        dispatcher.forward(request,response);
    }
}
