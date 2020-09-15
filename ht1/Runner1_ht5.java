/**
 * Task #5 (lesson1)
 * @author Alexander Butkevich
 */
public class Runner1_ht5 {
    /**
     * вычисление и вывод z(x,y)
     * по формуле для трех пар x,y
     */
    public static void main(String[] args) {

        // объявление и инициализация переменных z,x1,y1,x2,y2,x3,y3
        int z = 0;
        int x1 = 8, y1 = 5;
        int x2 = 5, y2 = 0;
        int x3 = 0, y3 = 6;

        // вычисление и вывод z(x1,y1)
        z = 7*x1*x1 + 3*y1*y1 - 3*x1*2*y1 + 6*x1 - 8*y1;
        System.out.println("\nVariables x1="+x1+";y1="+y1);
        System.out.println("Println method.");
        System.out.println("z = 7*"+x1+"^2 + 3*"+y1+"^2 - 3*"+x1+"*2*"+y1+
                " + 6*"+x1+" - 8*"+y1+" = "+z);
        System.out.println("Printf method.");
        System.out.printf("z = 7*%d^2 + 3*%d^2 - 3*%d*2*%d + 6*%d - 8*%d = %d\n",
                x1,y1,x1,y1,x1,y1,z);

        // вычисление и вывод z(x2,y2)
        z = 7*x2*x2 + 3*y2*y2 - 3*x2*2*y2 + 6*x2 - 8*y2;
        System.out.println("\nVariables x2="+x2+";y2="+y2);
        System.out.println("Println method.");
        System.out.println("z = 7*"+x2+"^2 + 3*"+y2+"^2 - 3*"+x2+"*2*"+y2+
                " + 6*"+x2+" - 8*"+y2+" = "+z);
        System.out.println("Printf method.");
        System.out.printf("z = 7*%d^2 + 3*%d^2 - 3*%d*2*%d + 6*%d - 8*%d = %d\n",
                x2,y2,x2,y2,x2,y2,z);

        // вычисление и вывод z(x3,y3)
        z = 7*x3*x3 + 3*y3*y3 - 3*x3*2*y3 + 6*x3 - 8*y3;
        System.out.println("\nVariables x3="+x3+";y3="+y3);
        System.out.println("Println method.");
        System.out.println("z = 7*"+x3+"^2 + 3*"+y3+"^2 - 3*"+x3+"*2*"+y3+
                " + 6*"+x3+" - 8*"+y3+" = "+z);
        System.out.println("Printf method.");
        System.out.printf("z = 7*%d^2 + 3*%d^2 - 3*%d*2*%d + 6*%d - 8*%d = %d\n",
                x3,y3,x3,y3,x3,y3,z);

    }
}
