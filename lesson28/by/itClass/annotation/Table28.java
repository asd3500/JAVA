package by.itClass.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table28 {
    String name();//attr -> name (name() -> "users" (getter))
    int type() default 0; // attr -> type (type() -> 1)
}
