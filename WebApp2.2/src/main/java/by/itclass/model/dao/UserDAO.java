package by.itclass.model.dao;

import by.itclass.model.beans.User;

public interface UserDAO {
    User get(String login);

    boolean find(String login);

    void put(User user);
}
