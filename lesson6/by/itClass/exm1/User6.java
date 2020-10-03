package by.itClass.exm1;

public class User6 {
    private String login;
    private String password;
    private String roleStr; // ADMIN, MODERATOR, GUEST
    private Role6 role;

    public User6() {
    }

    public User6(String login, String password, String roleStr) {
        this.login = login;
        this.password = password;
        this.roleStr = roleStr;
    }

    public User6(String login, String password, Role6 role) {
        this.login = login;
        this.password = password;
        this.role = role;
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

    public String getRoleStr() {
        return roleStr;
    }

    public void setRoleStr(String roleStr) {
        this.roleStr = roleStr;
    }

    public Role6 getRole() {
        return role;
    }

    public void setRole(Role6 role) {
        this.role = role;
    }

    public String info() {
        return "login=" + login +
                ", password=" + password +
                ", roleStr=" + roleStr +
                ", role=" + role;
    }
}
