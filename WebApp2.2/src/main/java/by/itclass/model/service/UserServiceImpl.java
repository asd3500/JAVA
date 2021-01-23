package by.itclass.model.service;

import by.itclass.model.beans.User;
import by.itclass.model.dao.UserDAO;
import by.itclass.model.dao.UserDAOImpl;

import java.util.Objects;


public class UserServiceImpl implements UserService {
    private UserDAO dao;

    public UserServiceImpl() {
        dao = new UserDAOImpl();
    }

    @Override
    public User get(String login, String password) {
        User user = dao.get(login);

        if (Objects.nonNull(user) && !password.equals(user.getPassword())) {
            user = null;
        }
        return user;
    }

    @Override
    public boolean find(String login){
        return dao.find(login);
    }

    @Override
    public boolean put(User user) {
        boolean f = dao.find(user.getLogin());
        if (!f) {
            dao.put(user);
        }
        return !f;
    }

}
