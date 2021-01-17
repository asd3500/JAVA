package by.itClass.model.dao;

import by.itClass.model.beans.User;

public interface UserDAO {
    boolean find(User user, String password);
}
