package by.itClass.interfaces;

public abstract class AMaterial extends ACargo {
    private double density;

    public AMaterial() {
        super();
    }

    public AMaterial(String name, double density) {
        super(name);
        this.density = density;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; density=" + density;
    }
}
