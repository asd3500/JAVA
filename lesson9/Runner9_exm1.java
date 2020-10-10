import by.itClass.OuterClass9;

/**
 * inner classes
 * @author Alexander Butkevich
 */
public class Runner9_exm1 {
    public static void main(String[] args) {
        OuterClass9 outerClass = new OuterClass9(100, 200, 300);
        OuterClass9 outerClass2 = new OuterClass9(111, 222, 333);

        outerClass.infoOuter();

        OuterClass9.staticField = 1000;

        OuterClass9.InnerClass innerClass = outerClass.new InnerClass(150, 250);
        innerClass.infoInner();

        System.out.println("\nset innerClass");
        outerClass.setInnerClass(innerClass);
        outerClass.infoOuter();

        System.out.println("\nouterClass2");
        outerClass2.infoOuter();

        outerClass2.setInnerClass(innerClass);
        System.out.println("\nset innerClass");
        outerClass2.infoOuter();

        OuterClass9.InnerClass innerClass2 = outerClass2.new InnerClass(350, 450);
        System.out.println("\nset innerClass");
        outerClass2.setInnerClass(innerClass2);
        outerClass2.infoOuter();
    }
}
