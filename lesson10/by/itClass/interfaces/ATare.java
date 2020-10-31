package by.itClass.interfaces;

public abstract class ATare implements IMassable {
    private AMaterial material;
    private double ownMass;

    public ATare() {
    }

    public ATare(AMaterial material, double ownMass) {
        this.material = material;
        this.ownMass = ownMass;
    }

    public abstract double getVolume();

    @Override
    public double getMass() {
        return ownMass + getVolume() * material.getDensity();
    }

    @Override
    public String toString() {
        return  "material=" + material +
                "; volume=" + getVolume() +
                "; mass=" + getMass() + "}";
    }
}
