package by.itClass.model.service;

import by.itClass.model.beans.User;

public interface UserService {
    User get(String login, String password);
}
