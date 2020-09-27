package by.itClass;

public class User5 implements Comparable<User5>{
    private int id;
    private String login;
    private String password;

    public User5() {
    }

    public User5(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String info() {
        return "user: id=" + id + ", login=" + login + ", password=" + password;
    }

    @Override
    // = 0 - ==
    // > 0 - this > user
    // < 0 - this < user
    public int compareTo(User5 user) {
        return this.id - user.id;
    }
}
