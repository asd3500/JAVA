import by.itClass.User21;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Runner21_exm1 {
    public static void main(String[] args) {

        List<User21> users1 = new ArrayList<>();
        users1.add(new User21(2,"admin", Arrays.asList("admin1@mail.ru", "", "adm@gmail.com")));
        users1.add(new User21(5,"alex99", Arrays.asList("alex99@mail.ru", "", null)));
        users1.add(new User21(8,"guest", Arrays.asList("guest@mail.ru", "", null)));
        users1.add(new User21(1,"kate88", Arrays.asList("kate88@mail.ru")));

        // list emails not null not empty
        List<String> emails = users1.stream()
                .flatMap(user -> user.getEmails().stream())
                .filter(email -> Objects.nonNull(email) && !email.isEmpty())
                .collect(Collectors.toList());
        System.out.println(emails);

        List<User21> users2 = new ArrayList<>();
        users2.add(new User21(2,"admin", "admin", Arrays.asList("admin1@mail.ru", "", "adm@gmail.com")));
        users2.add(new User21(7,"dmitri", "admin", Arrays.asList("dima@mail.ru", "", "adm@gmail.com")));
        users2.add(new User21(5,"alex99", "moderator", Arrays.asList("alex99@mail.ru", "", null)));
        users2.add(new User21(8,"guest", "guest", Arrays.asList("guest@mail.ru", "", null)));
        users2.add(new User21(1,"kate88", "guest", Arrays.asList("kate88@mail.ru")));

        // map key:role, value: count
        Map<String, Long> roleMap = users2.stream()
                .collect(Collectors.groupingBy(User21::getRole, Collectors.counting()));
        System.out.println(roleMap);

        // map key:role, value: List<String> logins
//        Map<String, List<String>> roleLoginsMap = users2.stream()

    }
}
