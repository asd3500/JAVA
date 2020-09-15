/**
 * Task #1 (lesson3)
 * @author Alexander Butkevich
 */
public class Runner3_ht1 {
    /**
     * подсчет количества слов в строке str
     */
    public static void main(String[] args) {

        // исходная строка
        String str = "A rolling stone gathers no moss";
        System.out.println("str: " + str);

        // #1 количество слов
        System.out.println(str.split(" ").length + " words");

        // #2 количество слов
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ') {
                cnt++;
            }
        }
        System.out.println(cnt+" words");

        // слова из менее чем 3-х символов
        String[] words = str.split(" ");
        cnt = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()<3) {
                cnt++;
                System.out.printf("%d: %s\n",cnt,words[i]);
            }
        }
        if(cnt==0) {
            System.out.println("0 words with lesser then 3 chars");
        }

    }
}
