package by.itClass.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "FormServlet", urlPatterns = {"/formServ"})
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final PrintWriter writer = response.getWriter();
        writer.append("METHOD: ").append(request.getMethod());

//        String param1 = request.getParameter("text1");
//        String[] params2 = request.getParameterValues("text2");
//        String password = request.getParameter("password");
//
//        String radio = request.getParameter("radio1");
//
//        String checkbox1 = request.getParameter("checkbox1");
//        String checkbox2 = request.getParameter("checkbox2");
//        String checkbox3 = request.getParameter("checkbox3");
//
//        writer.append("\nparam1: ").append(param1);
//        writer.append("\nparams2: ").append(Arrays.toString(params2));
//        writer.append("\npassword: ").append(password);
//        writer.append("\nradio: ").append(radio);
//        writer.append("\ncheckbox1: ").append(checkbox1);
//        writer.append("\ncheckbox2: ").append(checkbox2);
//        writer.append("\ncheckbox3: ").append(checkbox3);

        Map<String, String[]> params = request.getParameterMap();
        params.forEach((param, value)->{
            writer.append("\n").append(param).append(": ");
            if(value.length == 1) {
                writer.append(value[0]);
            } else {
                writer.append(Arrays.toString(value));
            }
        });

//        Set<Map.Entry<String, String[]>> setParams = params.entrySet();
//        for(Map.Entry<String, String[]> entry : setParams) {
//            String parName = entry.getKey();
//            String[] parValue = entry.getValue();
//            writer.append("\n").append(parName).append(": ").append(Arrays.toString(parValue));
//        }

        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
