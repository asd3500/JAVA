import by.itClass.MyClass12;

public class Runner12_exm2 {
    public static void main(String[] args) {

        MyClass12 object = new MyClass12();

        try {
            object.setCount(-100);
        } catch (Exception exc) {
            exc.printStackTrace();
            object.setCount(500);
        }


        System.out.println(object);

    }
}
