package by.itclass.model.service;

import by.itclass.model.beans.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    User get(String login, String password);

    boolean find(String login);

    boolean put(User user);

    HttpServletRequest addAttr(HttpServletRequest request, User user);
}
