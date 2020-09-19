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
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        // перебор слов
        for (int i = 0; i < words.length; i++) {
            int wordLength = words[i].length();

            // добавление пробелов в строки результатов начиная со второго слова
            if (i>0) {
                str1.append(" ");
                str2.append(" ");
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
                    && words[i].charAt(j + 1) <= '9') {

                    // замена арифметических знаков на их названия
                    switch (words[i].charAt(j)) {
                        case '+':
                            str1.append("plus");
                            str2.append("minus");
                            break;
                        case '-':
                            str1.append("minus");
                            str2.append("plus");
                            break;
                        case  '*':
                            str1.append("multiply");
                            str2.append("divide");
                            break;
                        case '/':
                            str1.append("divide");
                            str2.append("multiply");
                            break;

                            // если между числами не арифметический знак - добавить символ в рез. строку
                        default:
                            str1.append(words[i].charAt(j));
                            str2.append(words[i].charAt(j));
                    }

                } else {

                    // добавление остальных символов
                    str1.append(words[i].charAt(j));
                    str2.append(words[i].charAt(j));
                }
            }
        }

        // вывод результата
        System.out.printf("str1: %s\n", str1.toString());
        System.out.printf("str2: %s\n", str2.toString());
    }
}
