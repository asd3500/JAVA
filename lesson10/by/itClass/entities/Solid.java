package by.itClass.entities;

import by.itClass.interfaces.AMaterial;

public class Solid extends AMaterial {

    public Solid() {
    }

    public Solid(String name, double density) {
        super(name, density);
    }

    @Override
    public String toString() {
        return "Solid{" + super.toString() + "}";
    }
}
