package by.itclass.model.db;

import by.itclass.model.beans.User;

import java.util.HashMap;
import java.util.Map;

public class DataBaseMemory {
    public static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("admin", new User("admin", "q123", "Alex", "Freeman", 30));
    }
}
