package by.itClass.exm1;

public class Security6 {
    public static boolean isAccess(User6 user, String roleStr) {
        return user.getRoleStr().equals(roleStr);

    }
}

