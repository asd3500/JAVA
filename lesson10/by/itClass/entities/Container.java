package by.itClass.entities;

import by.itClass.enums.MassableKind;
import by.itClass.interfaces.ATare;

public class Container extends ATare {
    private static final double HEIGHT = 2.6;
    private static final double LENGTH = 6.1;
    private static final double WIDTH = 2.4;
    private static final double OWN_MASS = 2.5;

    public Container() {
        super();
    }

    public Container(Solid solid) {
        super(solid, OWN_MASS * 1000);
    }

    @Override
    public double getVolume() {
        return Math.round(HEIGHT * LENGTH * WIDTH * 10) / 10. ;
    }

    @Override
    public String toString() {
        return "Container{" + super.toString() + "}";
    }

    @Override
    public int getOrdinal() {
        return MassableKind.CONTAINER.ordinal();
    }
}
