package by.itClass.controller;

import by.itClass.model.beans.User;
import by.itClass.model.service.UserService;
import by.itClass.model.service.UserServiceImpl;

import static by.itClass.Constants.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {
    private UserService userService;

    public LoginController() {
        userService = new UserServiceImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter(LOGIN_LABEL);
        String password = request.getParameter(PASSWORD_LABEL);

        if(Objects.isNull(login) || Objects.isNull(password)) {
            jumpMessage(request, response, LOGIN_JSP, NULL_LOGIN_OR_PASS_MESSAGE);
            return;
        }

        login = login.trim();
        password = password.trim();

        if (login.isEmpty() || password.isEmpty()) {
            jumpMessage(request, response, LOGIN_JSP, EMPTY_LOGIN_OR_PASS_MESSAGE);
            return;
        }

        User user = userService.get(login, password);

        if (Objects.nonNull(user)) {
            request.setAttribute(USER_LABEL, user);
            jump(request, response, INDEX_JSP);
            return;
        } else {
            jumpMessage(request, response, LOGIN_JSP, INCORRECT_LOGIN_OR_PASS_MESSAGE);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    private void jumpMessage(HttpServletRequest request, HttpServletResponse response, String url, String message) throws ServletException, IOException{
        request.setAttribute(MESSAGE_LABEL, message);
        jump(request, response, url);
    }

    private void jump(HttpServletRequest request, HttpServletResponse response, String url) throws ServletException, IOException{
        request.getRequestDispatcher(url).forward(request, response);
    }
}
