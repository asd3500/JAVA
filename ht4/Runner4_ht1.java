/**
 * Task #1 (lesson4)
 * @author Alexander Butkevich
 */
public class Runner4_ht1 {
    /**
     * работа с классом User
     */
    public static void main(String[] args) {

        // создание объектов user1, user2
        User4 user1 = new User4();
        User4 user2 = new User4();

        // инициализация полей объектов
        user1.id = 1;
        user1.login = "Admin";
        user2.id = 2;
        user2.login = "Moder";

        // вывод значений полей объектов в консоль
        System.out.println(user1.id + ";" + user1.login);
        System.out.println(user2.id + ";" + user2.login);
    }
}
