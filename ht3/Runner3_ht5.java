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

        // создание строки
        String str = "one two 3+4 five six 7*8 nine 9%10 ten two2-5five 6/9+5-4*2";
        System.out.printf("str: %s\n", str);

        // переменные для результата
        StringBuilder resultStr1 = new StringBuilder();
        StringBuilder resultStr2 = new StringBuilder();


        // перебор символов
        for (int i = 0; i < str.length(); i++) {

            // поиск выполнения условия
            // 0    1   ...     i-1     i       i+1
            //                  0-9     +-*/    0-9
            if (i > 0 && i < str.length() - 1 &&
                str.charAt(i - 1) >= '0' &&
                str.charAt(i - 1) <= '9' &&
                str.charAt(i + 1) >= '0' &&
                str.charAt(i + 1) <= '9') {

                // замена арифметических знаков на их названия
                switch (str.charAt(i)) {
                    case '+':
                        resultStr1.append("plus");
                        resultStr2.append("minus");
                        break;
                    case '-':
                        resultStr1.append("minus");
                        resultStr2.append("plus");
                        break;
                    case  '*':
                        resultStr1.append("multiply");
                        resultStr2.append("divide");
                        break;
                    case '/':
                        resultStr1.append("divide");
                        resultStr2.append("multiply");
                        break;

                    // если между числами не арифметический знак - добавить символ в рез. строку
                    default:
                        resultStr1.append(str.charAt(i));
                        resultStr2.append(str.charAt(i));
                    }

                } else {

                    // добавление остальных символов
                    resultStr1.append(str.charAt(i));
                    resultStr2.append(str.charAt(i));
                }
            }

        // вывод результата
        System.out.printf("result string 1: %s\n", resultStr1.toString());
        System.out.printf("result string 2: %s\n", resultStr2.toString());
    }
}
