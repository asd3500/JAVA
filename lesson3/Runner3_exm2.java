/**
 * types converting
 * @author Alexander Butkevich
 */
public class Runner3_exm2 {
    public static void main(String[] args) {
        double numberDouble = 8.97;
        int numberInt = (int)numberDouble;

        System.out.println(numberDouble);
        System.out.println(numberInt);

        numberInt = 250;
        byte numberByte = (byte) numberInt;

        System.out.println(numberInt);
        System.out.println(numberByte);

        numberByte = 18;
        numberInt = numberByte;

        System.out.println(numberByte);
        System.out.println(numberInt);

        numberInt = 235;
        numberDouble = numberInt;
        System.out.println(numberInt);
        System.out.println(numberDouble);

        numberDouble = 9 + 4 * 2.1;
        System.out.println(numberDouble);

        numberInt = 2147483125;
        float numberFloat = numberInt;
        System.out.println(numberInt);
        System.out.println(numberFloat);


    }
}
