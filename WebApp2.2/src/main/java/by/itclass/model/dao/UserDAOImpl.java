package by.itclass.model.dao;

import by.itclass.model.beans.User;
import by.itclass.model.db.DataBaseMemory;

public class UserDAOImpl implements UserDAO{

    @Override
    public User get(String login) {
        return DataBaseMemory.userMap.get(login);
    }

    @Override
    public boolean find(String login) {
        return DataBaseMemory.userMap.containsKey(login);
    }

    @Override
    public void put(User user) {
        DataBaseMemory.userMap.put(user.getLogin(), user);
    }
}
