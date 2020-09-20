package exm2;

import exm2.by.itClass.Person4;
import exm2.by.itClass.Student4;

/**
 * ООП
 * @author Alexander Butkevich
 */
public class Runner4_exm2 {
    public static void main(String[] args) {

        // модификаторы доступа
        // public - доступ во всем проекте
        // default - доступ в рамках одного пакета
        // protected - доступ в рамках пакета(всем) и доступ в рамках
        //              проекта(только наследникам)
        // private - доступ в рамках класса

        Person4 alex = new Person4("Alex", 26);

        System.out.println("person: " + alex.info());

        alex.setAge(27);

        System.out.println("person: " + alex.info());
        System.out.println("name: " + alex.getName());

        Student4 student1 = new Student4( "Math");
        System.out.println(student1.info());


        Student4 student2 = new Student4("Vasya", 24, "Phis");
        System.out.println(student2.info());

        Person4 object = null;
        object = student1;
        object = new Student4();

        System.out.println(object.info());
    }
}
