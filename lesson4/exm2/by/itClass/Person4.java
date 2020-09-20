package exm2.by.itClass;

// для классов только public или default
public class Person4 {
    private String name;
    protected int age; // generate hk - Alt+Insert

    public Person4() {
        name = "";
        age = 0;
    }

    public Person4(String paramName, int paramAge) {
        name = paramName;
        age = paramAge;
    }

    // аксессоры (сеттеры, геттеры)
    public void setName(String paramName) {
        name = paramName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int paramAge) {
        age = paramAge;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return "name:" + name + ", age:" + age;
    }
}