import java.util.Scanner;

/**
 * Task #3
 * @author Alexander Butkevich
 */
public class Runner3_ht3 {
    /**
     * работа со строкой введенной с консоли
     */
    public static void main(String[] args) {

        // ввод строки
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String str = sc.nextLine();

        // создание массива слов из строки
        String[] words = str.split(" ");

        // количество слов
        System.out.printf("words number: %d\n", words.length);

        // количество символов в каждом слове
        for (int i = 0; i < words.length; i++) {
            System.out.printf("\t%d) %s - %d letter%c\n",
                    i + 1, words[i], words[i].length(),
                    (words[i].length() > 1 ? 's' : ' '));
        }

        // самое длинное слово
        int longestInd = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > words[longestInd].length()) {
                longestInd = i;
            }
        }
        String longestWord = new String(words[longestInd]);
        System.out.printf("longest word: %d) %s - %d letter%c",
                longestInd + 1, longestWord, longestWord.length(),
                (longestWord.length() > 1 ? 's' : ' '));

        // количество букв 'v' в самом длинном слове
        int count = 0;
        longestWord = longestWord.toLowerCase();
        for (int i = 0; i < words[longestInd].length(); i++) {
            if(longestWord.charAt(i) == 'v') {
                count++;
            }
        }
        System.out.printf(", character 'v' number - %d\n", count);

        // слова с четным количеством букв
        System.out.println("words with even number of letters:");
        count = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() % 2 == 0) {
                count++;
                System.out.printf("\t%d) %s - %d letter%c\n", i + 1,
                        words[i], words[i].length(),
                        (words[i].length() > 1 ? 's' : ' '));
            }
        }
        if(count == 0) {
            System.out.println("\tno such words");
        }

        sc.close();
    }
}
