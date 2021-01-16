package by.itClass.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newServ")
public class NewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strAttr = (String) request.getAttribute("str");
        request.setAttribute("newAttr", "NewServlet strAttr=" + strAttr);

        request.getRequestDispatcher("/attr.jsp").forward(request, response);

//        response.sendRedirect("http://vk.com");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
