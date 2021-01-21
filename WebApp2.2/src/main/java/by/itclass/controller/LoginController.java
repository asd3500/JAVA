package by.itclass.controller;

import by.itclass.controller.util.ControllerUtil;
import by.itclass.model.beans.User;
import by.itclass.model.service.UserService;
import by.itclass.model.service.UserServiceImpl;

import static by.itclass.Constants.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {
    private final UserService userService;

    public LoginController() {
        userService = new UserServiceImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter(LOGIN_LABEL);
        String password = request.getParameter(PASSWORD_LABEL);

        if (Objects.isNull(login) || Objects.isNull(password)) {
            ControllerUtil.jumpMess(LOGIN_JSP, NULL_LOGIN_OR_PASS_MESSAGE, request, response);
            return;
        } else if (login.isEmpty() || password.isEmpty()) {
            ControllerUtil.jumpMess(LOGIN_JSP, EMPTY_LOGIN_OR_PASS_MESSAGE, request, response);
            return;
        }

        User user = userService.get(login, password);

        if (Objects.nonNull(user)) {
            request = userService.addAttr(request, user);
            ControllerUtil.jump(INDEX_JSP, request, response);
        } else {
            ControllerUtil.jumpMess(LOGIN_JSP, INCORRECT_LOGIN_OR_PASS_MESSAGE, request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
