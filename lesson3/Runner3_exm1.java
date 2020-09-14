import java.util.Arrays;

/**
 * String
 * @author Alexander Butkevich
 */
public class Runner3_exm1 {
    public static void main(String[] args) {

        // создание строки
        String str1 = "Hello Java!";
        String str2 = new String("Hello Java!");
        char[] chars = {'c', 'a', 't', 'x', 'w'};
        String str3 = new String(chars);
        System.out.println("str3 = "+str3);
        String str4 = new String(chars, 0, 3);
        System.out.println("str4 = "+str4);

        // создание пустой строки
        String str5 = new String();
        String str6 = "";

        // pool строк
        boolean isEqual = (str1 == str2);
        System.out.println(isEqual ? "str1 == str2" : "str1 != str2");
        str3 = "Hello Java!";
        str4 = new String("Hello Java!");
        isEqual = (str1 == str3);
        System.out.println(isEqual ? "str1 == str3" : "str1 != str3");
        isEqual = (str2 == str4);
        System.out.println(isEqual ? "str2 == str4" : "str2 != str4");

        // методы строк
        str1 = "Java";
        str2 = "Hello";

        String result = str2 + str1;
        System.out.println("+: "+result);

        result = str2.concat(str1);
        System.out.println("concat: "+result);

        result = String.join(" ",str2, str1, "!");
        System.out.println("join: "+result);

        // извлечение символов из строки
        char ch = str1.charAt(0);
        System.out.println("str1.charAt(0) = "+ch);

        int start = 3, end = 7;
        char[] chars2 = new char[end-start];
        result.getChars(start, end, chars2,0);
        System.out.println("result.getCars() - "+ Arrays.toString(chars2));
        chars2 = result.toCharArray();
        System.out.println("result.toCharArray() - "+Arrays.toString(chars2));

        // сравнение строк
        str1 = "Java";
        str2 = new String("Java");

        isEqual = str1.equals(str2);
        System.out.println(str1+(isEqual?"==":"!=")+str2);

        str2 = new String("JAVA");
        isEqual = str1.equals(str2);
        System.out.println(str1+(isEqual?"==":"!=")+str2);

        isEqual = str1.equalsIgnoreCase(str2);
        System.out.println(str1+(isEqual?"==":"!=")+str2+" ignoreCase");

        str1 = "Hello world!";
        str2 = "I work";
        isEqual = str1.regionMatches(6, str2, 2, 3);
        System.out.println("str1.regionMatches(6, str2, 2, 3) - "+isEqual);
        isEqual = str1.regionMatches(6, str2, 2, 4);
        System.out.println("str1.regionMatches(6, str2, 2, 4) - "+isEqual);

        str1 = "AA";
        str2 = "BB";
        int compare = str1.compareTo(str2);
        // 0 - строки равны
        // >0 - str1>str2
        // <0 - str1<str2
        System.out.println("str1.compareTo(): "+compare);
        // str1.compareToIgnoreCase(str2)

        // поиск символов
        str1 = "Hello Java!";
        int index = str1.indexOf('l');
        System.out.println("str1.indexOf(): "+index);
        index = str1.lastIndexOf('l');
        System.out.println("str1.lastIndexOf(): "+index);

        str1 = "file.xml";
        boolean endWith = str1.endsWith(".xml");
        System.out.println("str1.endsWith(): "+endWith);

        str1 = "file.txt";
        endWith = str1.endsWith(".xml");
        System.out.println("str1.endsWith(): "+endWith);

        str1 = "D://file.xml";
        boolean startWith = str1.startsWith("D");
        System.out.println("str1.startsWith(): "+startWith);

        str1 = "C://file.xml";
        startWith = str1.startsWith("D");
        System.out.println("str1.startsWith(): "+startWith);

        // замена символов
        str1 = "Hello Java!";
        str2 = str1.replace("a", "X");
        System.out.println("str1: "+str1);
        System.out.println("str1.replace(): "+str2);

        // обрезка строки
        str1 = "             Admin      ";
        str2 = str1.trim();
        System.out.println("str1: "+str1+"|");
        System.out.println("str1.trim(): "+str2+"|");

        str1 = "Hello Java!";
        str2 = str1.substring(6,10);
        System.out.println("str1: "+str1);
        System.out.println("str1.substring(): "+str2);

        // изменение регистра
        str2 = str1.toUpperCase();
        System.out.println("str1.toUpperCase(): "+str2);
        str2 = str1.toLowerCase();
        System.out.println("str1.toLowerCase(): "+str2);

        // проверка на пустоту
        boolean isEmpty = str1.isEmpty();
        System.out.println("str1.isEmpty(): "+isEmpty);
        isEmpty = "".isEmpty();
        System.out.println("\"\".isEmpty(): "+isEmpty);

        // преобразование строки в массив слов
        str1 = "Hello Java from IT CLASS";
        String[] words = str1.split(" ");
        System.out.println("str1.split(): "+Arrays.toString(words));




    }
}
