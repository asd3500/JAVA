import by.itClass.exm1.IAction7;
import by.itClass.exm1.MyClass7;
/**
 * INTERFACE
 * @author Alexander Butkevich
 */
public class Runner7_exm1 {
    public static void main(String[] args) {

        IAction7 obj = null;
        //obj = new IAction7(); нельзя создать объект из интерфейса

        MyClass7 myObj = new MyClass7();

        obj = myObj;
        obj = new MyClass7();

        //obj.myMethod();
        myObj.myMethod();

        System.out.println(obj.message());
        obj.doSmth("JAVA SE");

        System.out.println(obj.NAME);
        System.out.println(myObj.YEAR);

        obj.m1();
        IAction7.m2();

    }
}
