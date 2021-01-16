package by.itClass.servlets;

import by.itClass.beans.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/attr")
public class AttrServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number = 100;
        Integer obNumber = 500;
        String str = "IT CLASS";
        User user = new User("Admin", "q12345");
        List<String> list = Arrays.asList("Java", "JavaScript", "PHP", "C++");

        request.setAttribute("number", number);
        request.setAttribute("obNumber", obNumber);
        request.setAttribute("str", str);
        request.setAttribute("user", user);
        request.setAttribute("list", list);

        RequestDispatcher rd = request.getRequestDispatcher("/newServ");
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}



