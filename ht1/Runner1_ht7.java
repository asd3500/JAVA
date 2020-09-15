import java.util.Scanner;

/**
 * Task #7 (lesson1)
 * @author Alexander Butkevich
 */
public class Runner1_ht7 {
    /**
     * Расчет общей стоимости покупок
     */
    public static void main(String[] args) {

        // ввод данных

        Scanner in = new Scanner(System.in);

        System.out.println("Введите стоимость конфет за 1кг");
        float candyCost = in.nextFloat();
        System.out.println("Введите стоимость печенья за 1кг");
        float cookieCost = in.nextFloat();
        System.out.println("Введите стоимость яблок за 1кг");
        float appleCost = in.nextFloat();

        System.out.println("Введите количество купленых конфет, кг");
        float candyQuantity = in.nextFloat();
        System.out.println("Введите количество купленного печенья, кг");
        float cookieQuantity = in.nextFloat();
        System.out.println("Введите количество купленых яблок, кг");
        float appleQuantity = in.nextFloat();

        // расчет

        float candyPrice = candyCost * candyQuantity;
        float cookiePrice = cookieCost * cookieQuantity;
        float applePrice = appleCost * appleQuantity;
        float totalPrice = candyPrice + cookiePrice + applePrice;

        // вывод результата

        System.out.println("\nПокупки:");
        System.out.printf("Конфеты (%.2f р/кг) - %.3f кг за %.2f р\n",
                candyCost,candyQuantity,candyPrice);
        System.out.printf("Печенье (%.2f р/кг) - %.3f кг за %.2f р\n",
                cookieCost,cookieQuantity,cookiePrice);
        System.out.printf("Яблоки (%.2f р/кг) - %.3f кг за %.2f р\n",
                appleCost,appleQuantity,applePrice);
        System.out.printf("Итого: %.2f р\n",totalPrice);

        in.close();
    }
}

