package by.itClass.entity;

import by.itClass.annotations.Register26;

public class Department26 {
    private String name;
    @Register26
    private String fullName;


    public Department26() {
        super();
    }

    public Department26(String name, String fullName) {
        this();
        this.name = name;
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
