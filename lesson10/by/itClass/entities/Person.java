package by.itClass.entities;

import by.itClass.enums.MassableKind;
import by.itClass.interfaces.IMassable;

public class Person implements IMassable {
    private String name;
    private double mass;

    public Person() {
    }

    public Person(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public int getOrdinal() {
        return MassableKind.PERSON.ordinal();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name  +
                "; mass=" + mass +
                '}';
    }
}
