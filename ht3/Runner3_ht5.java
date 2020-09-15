/**
 * Task #5 (lesson3)
 * @author Alexander Butkevich
 */
public class Runner3_ht5 {
    /**
     * замена знаков арифметических операций в словах
     * на название операций
     */
    public static void main(String[] args) {

        // создание строки и массива слов из строки
        String str = "one two 3+4 five six 7*8 nine 9%10 ten two2-5five 6/9+5-4*2";
        System.out.printf("str: %s\n", str);
        String[] words = str.split(" ");

        // переменные для результата
        String str1 = "";
        String str2 = "";

        // перебор слов
        for (int i = 0; i < words.length; i++) {
            int wordLength = words[i].length();

            // добавление пробелов в строки результатов начиная со второго слова
            if (i>0) {
                str1 += " ";
                str2 += " ";
            }

            // перебор букв в слове
            for (int j = 0; j < wordLength; j++) {

                // поиск выполнения условия
                // 0    1   ...     j-1     j       j+1
                //                  0-9     +-*/    0-9
                if (j > 0 && j < wordLength - 1
                    && words[i].charAt(j - 1) >= '0'
                    && words[i].charAt(j - 1) <= '9'
                    && words[i].charAt(j + 1) >= '0'
                    && words[i].charAt(j - 1) <= '9') {

                    // замена арифметических знаков на их названия
                    switch (words[i].charAt(j)) {
                        case '+':
                            str1 += "plus";
                            str2 += "minus";
                            break;
                        case '-':
                            str1 += "minus";
                            str2 += "plus";
                            break;
                        case  '*':
                            str1 += "multiply";
                            str2 += "divide";
                            break;
                        case '/':
                            str1 += "divide";
                            str2 += "multiply";
                            break;

                            // если между числами не арифметический знак - добавить символ рез. строку
                        default:
                            str1 += words[i].charAt(j);
                            str2 += words[i].charAt(j);
                    }

                } else {

                    // добавление остальных символов
                    str1 += words[i].charAt(j);
                    str2 += words[i].charAt(j);
                }
            }
        }

        // вывод результата
        System.out.printf("str1: %s\n", str1);
        System.out.printf("str2: %s\n", str2);
    }
}
