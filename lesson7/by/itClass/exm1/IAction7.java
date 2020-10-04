package by.itClass.exm1;

import java.io.Serializable;

public interface IAction7 extends Cloneable, Serializable {
    public static final String NAME = "IT CLASS";
    int YEAR = 2020; // public static final

    public abstract String message();
    void doSmth(String value); // public abstract

    default void m1() {
        System.out.println("DEFAULT METHOD");
    }

    static void m2() {
        System.out.println("STATIC METHOD");
    }
}
