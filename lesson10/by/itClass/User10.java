package by.itClass;

import java.util.Objects;

public class User10 {
    private int id;
    private String login;
    private String name;
    private int age;

    public User10() {
    }

    public User10(int id, String login, String name, int age) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show() {
        return "id=" + id + ", login=" + login +
                ", name=" + name + ", age=" + age;
    }

    @Override
    public String toString() {
        return "User10{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User10 user10 = (User10) o;

        if (id != user10.id) return false;
        if (age != user10.age) return false;
        if (!login.equals(user10.login)) return false;
        return name.equals(user10.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + login.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
