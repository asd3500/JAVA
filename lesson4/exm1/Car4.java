package exm1;

// класс, описывающий объект авто. (шаблон)
public class Car4 {
    // поля класса
    String model;
    String color;
    int maxSpeed;

    // конструктор без параметров
    Car4() { }

    Car4(String paramModel, int paramMaxSpeed) {
        model = paramModel;
        color = "DEFAULT-COLOR";
        maxSpeed = paramMaxSpeed;
    }

    // конструктор с параметрами
    Car4(String paramModel, String paramColor, int paramMaxSpeed) {
        model = paramModel;
        color = paramColor;
        maxSpeed = paramMaxSpeed;
    }

    // методы
    void doSmth(String message, int number) {
        System.out.println("Message:" + message + ", number=" + number);
    }

    String start() {
        return "START";
    }

    String stop() {
        return "STOP";
    }

    void info() {
        System.out.printf("Auto: %s, color: %s, max-speed: %d\n",
                model, color, maxSpeed);
    }
}
