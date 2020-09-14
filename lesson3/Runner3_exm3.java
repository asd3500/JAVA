/**
 * primitives wraps
 * @author Alexander Butkevich
 */
public class Runner3_exm3 {
    public static void main(String[] args) {

        // классы обертки Integer, Short, ...
        Integer iObj = new Integer(89);
        System.out.println("iObj = "+iObj);
        int number = iObj.intValue();
        System.out.println("number = "+number);

        String numberStr = "8935";
        number = Integer.parseInt(numberStr);
        System.out.println("Integer.parseInt(\"8935\") = "+number);

        iObj = Integer.valueOf(numberStr);
        System.out.println("iObj = Integer.valueOf(\"8935\") = "+iObj);

        iObj = Integer.valueOf(8236);
        System.out.println("iObj = "+iObj);

        // автоупаковка, автораспаковка
        int number2 = 823;
        Integer iObj2 = 12345;
        Integer iObj3 = number2;
        int number3 = iObj2;

        System.out.println("number2 = "+number2);
        System.out.println("iObj2 = "+iObj2);
        System.out.println("iObj3 = "+iObj3);
        System.out.println("number3 = "+number3);

        int summ = 12 + number3 + iObj2 + iObj;
        System.out.println("summ = "+summ);

        // pool of wraps
        Integer numb1 = 18;
        Integer numb2 = 18;
        Integer numb3 = new Integer(18);
        System.out.println(numb1 == numb2);
        System.out.println(numb1 == numb3);
    }
}
