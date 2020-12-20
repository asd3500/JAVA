package by.itClass;

import by.itClass.annotation.Table28;
//users->User28
@Table28(name = "users", type = 1)
public class User28 {
    private int id;
    private String login;

    public User28() {
        super();
    }

    public User28(int id, String login) {
        this();
        this.id = id;
        this.login = login;
    }

    @Override
    public String toString() {
        return "User28{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
