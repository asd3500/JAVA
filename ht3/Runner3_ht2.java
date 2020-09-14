/**
 * Task #2
 * @author Alexander Butkevich
 */
public class Runner3_ht2 {
    /**
     * поиск самых длинных, коротких и симметричных слов в строке str
     */
    public static void main(String[] args) {

        // создание строки и массива слов из строки
        String str = "one two an deed symmetrical did in solos lmao absolutely fast done peep deleveled development lol redivider shahs";
        System.out.println("str: " + str);
        String[] words = str.split(" ");

        int longestInd = 0;
        int shortestInd = 0;
        int longestSymInd = -1;
        int shortestSymInd = -1;

        // перебор слов для поиска
        for (int i = 0; i < words.length; i++) {

            // проверка слова на симметричность
            boolean isSym = true;
            int wordLen = words[i].length();
            for (int j = 0; j < wordLen/2; j++) {
                if(words[i].charAt(j) != words[i].charAt(wordLen - j - 1)) {
                    isSym = false;
                }
            }

            // поиск последнего самого длинного слова
            if(wordLen >= words[longestInd].length()) {
                longestInd = i;
            }

            // поиск первого самого короткого слова
            if(wordLen < words[shortestInd].length()) {
                shortestInd = i;
            }

            if(isSym) {

                // поиск первого самого длинного симметричного слова
                if(longestSymInd == -1 || wordLen > words[longestSymInd].length()) {
                    longestSymInd = i;
                }

                // поиск последнего самого короткого симметричного слова
                if(shortestSymInd== - 1 || wordLen <= words[shortestSymInd].length()) {
                    shortestSymInd = i;
                }
            }
        }

        System.out.println("last longest word: " + words[longestInd]);
        System.out.println("first shortest word: " + words[shortestInd]);
        System.out.println("first longest symmetrical word: " + (longestSymInd == - 1 ? "\"no symmetrical words\"" : words[longestSymInd]));
        System.out.println("last shortest symmetrical word: " + (shortestSymInd == - 1 ? "\"no symmetrical words\"" : words[shortestSymInd]));

    }
}
