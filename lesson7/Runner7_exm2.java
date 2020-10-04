/**
 * Number
 * @author Alexander Butkevich
 */
public class Runner7_exm2 {
    public static void main(String[] args) {

        int number1 = 7;

        Integer iOb1 = new Integer(number1);

        System.out.println("number1=" + number1);
        System.out.println("iOb1=" + iOb1);

        Integer iOb2 = Integer.valueOf(20);
        Integer iOb3 = Integer.valueOf("2020");

        System.out.println("iOb2=" + iOb2);
        System.out.println("iOb3=" + iOb3);

        int number2 = iOb3.intValue();
        int number3 = Integer.parseInt("2021");

        System.out.println("number2=" + number2);
        System.out.println("number3=" + number3);

        iOb1 = 25;
        iOb2 = number2;
        number3 = iOb3;

        int sum = number1 + number2 + number3 + iOb1 + iOb2 + iOb3 + 100;
        System.out.println("sum=" + sum);

        iOb1 = new Integer(8);
        iOb2 = Integer.valueOf(8);
        iOb3 = Integer.valueOf("8");
        Integer iOb01 = 8;
        Integer iOb02 = 8;

        System.out.println("iOb1 == iOb2: " + (iOb1 == iOb2));
        System.out.println("iOb2 == iOb3: " + (iOb2 == iOb3));
        System.out.println("iOb3 == iOb01: " + (iOb3 == iOb01));
        System.out.println("iOb01 == iOb02: " + (iOb01 == iOb02));


    }
}
