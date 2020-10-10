import by.itClass.OuterClass9;
/**
 * static inner classes
 * @author Alexander Butkevich
 */
public class Runner9_exm3 {
    public static void main(String[] args) {
        OuterClass9.StaticInnerClass staticClass = new OuterClass9.StaticInnerClass(55555);
        OuterClass9.staticField = 11111;
        staticClass.infoStatic();
    }
}
