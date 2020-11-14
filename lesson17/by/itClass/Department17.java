package by.itClass;

public class Department17 {
    private String name;
    private int firstShift;
    private int secondShift;

    public Department17() {
        super();
    }

    public Department17(String name, int firstShift, int secondShift) {
        super();
        setName(name);
        setFirstShift(firstShift);
        setSecondShift(secondShift);
    }

    public Department17(String name, String firstShift, String secondShift) {
        super();
        setName(name);
        setFirstShift(firstShift);
        setSecondShift(secondShift);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Department name is empty");
        }
    }

    public int getFirstShift() {
        return firstShift;
    }

    public void setFirstShift(int firstShift) {
        if (firstShift > 0) {
            this.firstShift = firstShift;
        } else {
            throw new IllegalArgumentException("Negative value for first shift");
        }

    }

    public void setFirstShift(String firstShift) {
        try {
            int fShift = Integer.parseInt(firstShift);
            setFirstShift(fShift);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public int getSecondShift() {
        return secondShift;
    }

    public void setSecondShift(int secondShift) {
        if (secondShift > 0) {
            this.secondShift = secondShift;
        } else {
            throw new IllegalArgumentException("Negative value for second shift");
        }

    }

    public void setSecondShift(String secondShift) {
        try {
            int sShift = Integer.parseInt(secondShift);
            setSecondShift(sShift);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", firstShift=" + firstShift +
                ", secondShift=" + secondShift +
                '}';
    }
}
