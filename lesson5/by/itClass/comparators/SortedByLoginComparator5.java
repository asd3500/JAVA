package by.itClass.comparators;

import by.itClass.User5;

import java.util.Comparator;

public class SortedByLoginComparator5 implements Comparator<User5> {

    @Override
    public int compare(User5 o1, User5 o2) {
        String login1 = o1.getLogin();
        String login2 = o2.getLogin();
        return login1.compareTo(login2);
    }
}
