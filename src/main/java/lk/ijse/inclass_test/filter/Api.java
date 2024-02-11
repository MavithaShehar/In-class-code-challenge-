package lk.ijse.inclass_test.filter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Api", urlPatterns = "/api")
public class Api extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(" api");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String header = req.getHeader("header");

        String info = req.getPathInfo();

        System.out.println(id);
        System.out.println(name);
        System.out.println(header);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Custom Do Get");
    }
}