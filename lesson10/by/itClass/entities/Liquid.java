package by.itClass.entities;

import by.itClass.interfaces.AMaterial;

public class Liquid extends AMaterial {

    public Liquid() {
    }

    public Liquid(String name, double density) {
        super(name, density);
    }

    @Override
    public String toString() {
        return "Liquid{" + super.toString() + "}";
    }
}
