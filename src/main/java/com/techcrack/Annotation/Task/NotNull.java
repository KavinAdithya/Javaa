package com.techcrack.Annotation.Task;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.MODULE})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
    boolean isNull() default false;
}
