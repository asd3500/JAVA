package by.itClass;

import by.itClass.annotation.Table28;
//users->User28
@Table28(name = "users", type = 1)
public class User28 {
    private int id;
    private String name;
    private String password;

    public User28() {
        super();
    }

    public User28(int id, String name, String password) {
        this();
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User28{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
