package by.itClass.model.db;

import by.itClass.model.beans.User;

import java.util.HashMap;
import java.util.Map;

public class DataBaseMemory {
    public static Map<User, String> map = new HashMap<>();

    static {
        map.put(new User(1, "admin"), "admin123");
        map.put(new User(2, "Max"), "m123");
        map.put(new User(3, "Kate"), "kate88");
    }
}
