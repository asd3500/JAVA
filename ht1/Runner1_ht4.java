/**
 * Task #4 (lesson1)
 * @author Alexander Butkevich
 */
public class Runner1_ht4 {
    /**
     * вывод в консоль значения переменных
     * методами println, printf
     */
    public static void main(String[] args) {

        // объявление и инициализация переменных
        char letterK = 'K';
        int monthNumber = 9;
        float pi = 3.1415f;
        double moonDistance = 3.84399e+8;

        // вывод переменных в консоль методом println
        System.out.println("println: char:"+letterK+" int:"+monthNumber+" float:"+pi+" double:"+moonDistance);

        // вывод переменных в консоль методом printf
        System.out.printf("printf:  char:%c;int:%d;float:%.2f;double:%.0f\n",letterK,monthNumber,pi,moonDistance);
    }
}
