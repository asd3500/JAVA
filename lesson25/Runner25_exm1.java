import java.util.Arrays;

public class Runner25_exm1 {
    public static void main(String[] args) {
        // регулярные выражения RegEx
        String regex = "";
        String str = "Hello IT Class";

        // методы класса String, которые используют регулярные выражения
        String[] arr = str.split(" ");
        System.out.println("arr=" + Arrays.toString(arr));

        str = "asdyrq3500@gmail.com";
        regex = "\\w+@[a-z]+\\.[a-z]+";
        boolean flag = str.matches(regex);
        System.out.println("flag=" + flag);

        // синтаксис регулярных выражений
        // +        1 и более повторений
        // *        0 и более повторений
        // ?        0 или 1 повторение
        // {n}      n повторений
        // {n, m}   от n до m повторений
        // {n,}     n и более повторений
        // [...]    набор символов (..-.. промежутки)
        // (...)    логическое объединение символов в группу

        // \        символ экранирования
        // ^        символ отрицания (инверсии)
        // .        любой символ

        // \\       экран для спецсимволов
        // \\d      множество [0-9]
        // \\s      множество [\n\t\f\r]
        // \\w      множество [a-zA-Z0-9_]

        // \\D       множество [^0-9]
        // \\S       множество [^\n\t\f\r]
        // \\W       множество [^a-zA-Z0-9_]



    }
}
