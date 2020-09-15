/**
 * Task #6 (lesson1)
 * @author Alexander Butkevich
 */
public class Runner1_ht6 {
    /**
     * даны возрасты Тани и Миши,
     * вывод среднего возраста и
     * отличие возрастов Тани и Миши
     * от среднего
     */
    public static void main(String[] args) {

        // возраст Тани и Миши
        float tanyaAge = 20f;
        float mishaAge = 25f;

        // средний возраст
        float avgAge = (tanyaAge+mishaAge)/2;

        // разницы возрастов
        float tanyaDiff = tanyaAge - avgAge;
        float mishaDiff = mishaAge - avgAge;

        // вывод в консоль
        System.out.printf("\nВозраст Тани - %.0f, возраст Миши - %.0f.\n",
                tanyaAge,mishaAge);
        System.out.printf("Средний возраст - %.2f.\n",avgAge);
        System.out.printf("Возраст Тани на %.2f %s среднего\n",
                Math.abs(tanyaDiff), tanyaDiff>0 ? "больше" : "меньше");
        System.out.printf("Возраст Миши на %.2f %s среднего\n",
                Math.abs(mishaDiff), mishaDiff>0 ? "больше" : "меньше");

    }
}
