package by.itClass.model.dao;

import by.itClass.model.beans.User;
import by.itClass.model.db.DataBaseMemory;

public class UserMemoryDAOImpl implements UserDAO{

    @Override
    public boolean find(User user, String password) {
        String pass = DataBaseMemory.map.get(user);
        return password.equals(pass);
    }
}
