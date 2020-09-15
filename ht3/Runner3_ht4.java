/**
 * Task #4 (lesson3)
 * @author Alexander Butkevich
 */
public class Runner3_ht4 {
    /**
     * перестановка слов в строке
     */
    public static void main(String[] args) {

        // создание строки и массива слов из строки
        String str = "All good things must come to an end";
        System.out.println("str: " + str);
        String[] words = str.split(" ");

        int longestInd = 0;
        int shortestInd = 0;

        // поиск самых длинного и короткого слов
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() >= words[longestInd].length()) {
                longestInd = i;
            }
            if(words[i].length() < words[shortestInd].length()) {
                shortestInd = i;
            }
        }

        // перестановка слов
        String swap = words[longestInd];
        words[longestInd] = words[shortestInd];
        words[shortestInd] = swap;
        String newStr = "";
        for (int i = 0; i < words.length; i++) {
            newStr += words[i] + " ";
        }
        System.out.println("new str: " + newStr);

        // вывод слов, которые начинаются с буквы, как у первого самого короткого слова
        words = str.split(" ");
        System.out.printf("words which start with letter '%c':\n", words[shortestInd].toLowerCase().charAt(0));
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            if(words[i].charAt(0) == words[shortestInd].charAt(0)) {
                System.out.printf("\t%d) %s\n", i + 1, words[i]);
            }
        }

    }
}
