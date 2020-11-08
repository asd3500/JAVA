package by.itClass;

public class Person17 {
    private String name;
    private int age;

    public Person17() {
        super();
    }

    public Person17(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person17 person17 = (Person17) o;

        if (age != person17.age) return false;
        return name.equals(person17.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person17{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
