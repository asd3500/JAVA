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

@WebServlet(name = "RegisterController", urlPatterns = {"/register"})
public class RegisterController extends HttpServlet {
    private final UserService userService;

    public RegisterController() {
        userService = new UserServiceImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter(LOGIN_LABEL);
        String[] password = request.getParameterValues(PASSWORD_LABEL);
        String firstName = request.getParameter(FIRST_NAME_LABEL);
        String lastName = request.getParameter(LAST_NAME_LABEL);
        String ageStr = request.getParameter(AGE_LABEL);
        int age;
        try {
            age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            age = 0;
        }

        if (userService.find(login)) {
            ControllerUtil.jumpMess(REGISTER_JSP, LOGIN_NOT_AVAILABLE_MESSAGE, request, response);
            return;
        }

        if (!password[0].equals(password[1])) {
            ControllerUtil.jumpMess(REGISTER_JSP, PASS_NOT_EQUAL_MESSAGE, request, response);
            return;
        }

        if (age < 1) {
            ControllerUtil.jumpMess(REGISTER_JSP, INCORRECT_AGE_VALUE_MESSAGE, request, response);
            return;
        }

        User user = new User(login, password[0], firstName, lastName, age);
        userService.put(user);
        ControllerUtil.jumpMess(LOGIN_JSP, REGISTER_SUCCESSFUL_MESSAGE, request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
