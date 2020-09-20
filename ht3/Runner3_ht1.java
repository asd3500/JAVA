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

        // массив слов
        String[] words = str.split(" ");

        // количество слов
        System.out.println(words.length + " words");

        // слова из менее чем 3-х символов
        int cnt = 0;
        for (String word : words) {
            if(word.length()<3) {
                cnt++;
                System.out.printf("%d: %s\n",cnt,word);
            }
        }
        if(cnt==0) {
            System.out.println("0 words with lesser then 3 chars");
        }

    }
}
