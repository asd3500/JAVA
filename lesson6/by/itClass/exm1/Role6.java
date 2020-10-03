package by.itClass.exm1;

public enum Role6 {
    ADMIN(100),
    MODERATOR(200),
    GUEST(300);
    // public static final

    private int id;

    private Role6(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
