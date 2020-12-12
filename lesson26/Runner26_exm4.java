import by.itClass.annotations.Register26;
import by.itClass.entity.Department26;

import java.lang.reflect.Field;

public class Runner26_exm4 {
    public static void main(String[] args) {

        Department26 dept = new Department26("iT", "Back-end IT");
        System.out.println(dept);
        try {
            info(dept);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    // выводит инфо об объекте в формате: Department: name;fullName
    // если над полем класса стоит аннотация @Register, то
    // значение поля выводить в верхнем регистре, иначе в нижнем
    private static void info(Department26 dept) throws IllegalAccessException {
        Field[] fields = dept.getClass().getDeclaredFields();
        StringBuilder result = new StringBuilder("Department: ");
        for (Field field: fields) {
            field.setAccessible(true);
            String value = (String) field.get(dept);
            if (field.isAnnotationPresent(Register26.class)) {
                result.append(value.toUpperCase()).append("; ");
            } else {
                result.append(value.toLowerCase()).append("; ");
            }
        }
        System.out.println(result);
    }
}
