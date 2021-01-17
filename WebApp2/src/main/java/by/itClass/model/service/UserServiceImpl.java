package by.itClass.model.service;

import by.itClass.model.beans.User;
import by.itClass.model.dao.UserDAO;
import by.itClass.model.dao.UserMemoryDAOImpl;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl() {
        userDAO = new UserMemoryDAOImpl();
    }

    @Override
    public User get(String login, String password) {
        User user = new User(login);
        if (!userDAO.find(user, password)) {
            user = null;
        }
        return user;
    }
}
