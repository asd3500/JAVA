package by.itClass.exm1;

public class MyClass7 extends Object implements IAction7, Comparable<MyClass7> {

    @Override
    public String message() {
        return "Hello Java";
    }

    @Override
    public void doSmth(String value) {
        System.out.println("value=" + value);
    }

    @Override
    public int compareTo(MyClass7 o) {
        return 1;
    }

    public void myMethod() {
        System.out.println("name=" + NAME);
        System.out.println("year=" + YEAR);
    }

    @Override
    public void m1() {
        System.out.println("DEFAULT METHOD FROM MY_CLASS");
    }
}
