package by.itclass.controller.util;

import by.itclass.model.beans.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.itclass.Constants.*;

public final class ControllerUtil {
    public static void jump(String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }

    public static void jump(String url, ServletRequest request, ServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }

    public static void jumpMess(String url, String message, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute(MESSAGE_LABEL, message);
        jump(url, request, response);
    }

    public static void jumpMess(String url, String message, ServletRequest request, ServletResponse response) throws ServletException, IOException {
        request.setAttribute(MESSAGE_LABEL, message);
        jump(url, request, response);
    }

    public static void addUserAttr(HttpServletRequest request, User user) {
        request.setAttribute(LOGIN_LABEL, user.getLogin());
        request.setAttribute(FIRST_NAME_LABEL, user.getFirstName());
        request.setAttribute(LAST_NAME_LABEL, user.getLastName());
        request.setAttribute(AGE_LABEL, user.getAge());
    }
}
