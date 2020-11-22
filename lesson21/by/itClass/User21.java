package by.itClass;

import java.util.List;

public class User21 {
    private int id;
    private String login;
    private String role;
    private List<String> emails;

    public User21() {
        super();
    }

    public User21(int id, String login, List<String> emails) {
        this.id = id;
        this.login = login;
        this.emails = emails;
    }

    public User21(int id, String login, String role, List<String> emails) {
        this.id = id;
        this.login = login;
        this.role = role;
        this.emails = emails;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "User21{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", role='" + role + '\'' +
                ", emails=" + emails +
                '}';
    }
}
