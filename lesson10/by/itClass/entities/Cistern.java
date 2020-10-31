package by.itClass.entities;

import by.itClass.enums.MassableKind;
import by.itClass.interfaces.ATare;

public class Cistern extends ATare {
    private static final double RADIUS = 1.6;
    private static final double LENGTH = 5.5;
    private static final double OWN_MASS = 4.3;

    public Cistern() {
    }

    public Cistern(Liquid liquid) {
        super(liquid, OWN_MASS * 1000);
    }

    @Override
    public double getVolume() {
        return Math.round(Math.PI * Math.pow(RADIUS, 2) * LENGTH * 10) / 10.;
    }

    @Override
    public String toString() {
        return "Cistern{" + super.toString() + "}";
    }

    @Override
    public int getOrdinal() {
        return MassableKind.CISTERN.ordinal();
    }
}
