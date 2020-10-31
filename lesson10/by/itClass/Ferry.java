package by.itClass;

import by.itClass.interfaces.IMassable;

public class Ferry {
    private final double MAX_MASS = 500000;
    private IMassable[] massables;

    public Ferry() {
        massables = new IMassable[0];
    }

    public Ferry(IMassable[] massables) {
        this.massables = massables;
    }

    public IMassable[] getMassables() {
        return massables;
    }

    public void setMassables(IMassable[] massables) {
        this.massables = massables;
    }

    public void show() {
        System.out.println("Massables");
        for (IMassable massable : massables) {
            System.out.println(massable);
        }
    }

    public boolean isOverloaded() {
        double totalMass = 0;
        for (IMassable massable : massables) {
            totalMass += massable.getMass();
        }
        return totalMass > MAX_MASS;
    }
}
