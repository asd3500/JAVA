package by.itClass.interfaces;

public abstract class ACargo {
    private String name;

    public ACargo() {
    }

    public ACargo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name;
    }
}
