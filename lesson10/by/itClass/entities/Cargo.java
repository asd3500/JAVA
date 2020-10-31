package by.itClass.entities;

import by.itClass.enums.MassableKind;
import by.itClass.interfaces.ACargo;
import by.itClass.interfaces.IMassable;

public class Cargo extends ACargo implements IMassable {
    private double mass;

    public Cargo() {
        super();
    }

    public Cargo(String name, double mass) {
        super(name);
        this.mass = mass;
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public int getOrdinal() {
        return MassableKind.CARGO.ordinal();
    }

    @Override
    public String toString() {
        return "Cargo{" + super.toString() +
                "; mass=" + mass + "}";
    }
}
