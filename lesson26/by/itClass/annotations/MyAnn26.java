package by.itClass.annotations;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Target;

@Target({METHOD, FIELD, TYPE}  ) // может применяться только для методов и полей
@Retention(RUNTIME) // аннотация будет "жить" только в исходном коде
public @interface MyAnn26 { // CLASS -> SOURCE + во время компиляции
                          // RUNTIME -> CLASS + во время работы

}