package by.itClass;

import java.util.Objects;

// Cloneable - интерфейс маркер (отсутствуют методы)
public class User10 implements Cloneable {
    private int id;
    private String login;
    private String name;
    private int age;
    private Phone10 phone;

    public User10() {
        phone = new Phone10();
    }

    public User10(int id, String login, String name, int age) {
        this();
        this.id = id;
        this.login = login;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public Phone10 getPhone() {
        return phone;
    }

    public void setPhone(String number) {
        phone.setNumber(number);
    }

    public String show() {
        return "id=" + id + ", login=" + login +
                ", name=" + name + ", age=" + age;
    }

    @Override
    public String toString() {
        return "User10{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", " + phone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User10 user10 = (User10) o;

        if (id != user10.id) return false;
        //if (age != user10.age) return false;
        if (!login.equals(user10.login)) return false;
        return name.equals(user10.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + login.hashCode();
        result = 31 * result + name.hashCode();
        //result = 31 * result + age;
        return result;
    }

//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    // при переопределении метода доступ можно расширить
    // private, protected -> public
    // наоборот - нельзя
    @Override
    public Object clone() throws CloneNotSupportedException {
        Phone10 phoneCopy = (Phone10) phone.clone();
        User10 userCopy = (User10) super.clone();
        userCopy.phone = phoneCopy;
        return userCopy;
    }
}
