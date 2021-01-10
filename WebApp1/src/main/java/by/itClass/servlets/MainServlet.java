package by.itClass.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MainServlet", urlPatterns = {"/main", "/mservlet"},
            initParams = {
                @WebInitParam(name = "servParam1", value = "Servlet param1 value"),
                @WebInitParam(name = "servParam2", value = "Servlet param2 value")
            })
public class MainServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Method POST").close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //        ServletContext context = this.getServletContext();
        ServletContext context = getServletContext();
        String contextPath = context.getContextPath(); // имя контекста
        String param1 = context.getInitParameter("param1"); // глобальный параметр web.xml
        String param2 = context.getInitParameter("param2");
        String indexPath = context.getRealPath("/index.html");

        context.setAttribute("attr1", "Attribute value");
        String attrValue = (String) context.getAttribute("attr1");

        ServletConfig config = getServletConfig();
        String servName = config.getServletName();
        String servParam1 = config.getInitParameter("servParam1");
        String servParam2 = config.getInitParameter("servParam2");
        String servParam3 = config.getInitParameter("param3");

        PrintWriter writer = response.getWriter();
        writer.append("<html>").append("<body>");
        writer.append("Method GET");
        writer.append("<br>contextPath: ").append(contextPath);
        writer.append("<br>param1: ").append(param1);
        writer.append("<br>param2: ").append(param2);
        writer.append("<br>index path: ").append(indexPath);
        writer.append("<br>attr1: ").append(attrValue).append("\n");
        writer.append("<h3>");
        writer.append("<br>servlet name: ").append(servName);
        writer.append("<br>servParam1: ").append(servParam1);
        writer.append("<br>servParam2: ").append(servParam2);
        writer.append("<br>param3: ").append(servParam3);
        writer.append("</h3>");
        writer.append("</body>").append("</html>");
        writer.close();
    }


}
