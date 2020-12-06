import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner25_exm2 {
    public static void main(String[] args) {
        String regex = "(\\w+)@([a-z]+)\\.([a-z]+)";
        String str = "Hello IT Class email1: itclass@gmail.com email2: itgomel@mail.ru phone: 777555";

//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher  = pattern.matcher(str);
        Matcher matcher = Pattern.compile(regex).matcher(str);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.printf("\nstart: %d, end: %d, substr: %s\n", start, end, matcher.group());
            System.out.println("login: " + matcher.group(1));
            System.out.println("host: " + matcher.group(2));
            System.out.println("loc: " + matcher.group(3));
        }

        matcher.reset("itclass@gmail.com Hello");

        boolean flag = matcher.lookingAt();
        System.out.println("flag: " + flag);
        System.out.println(matcher.group());


    }
}
