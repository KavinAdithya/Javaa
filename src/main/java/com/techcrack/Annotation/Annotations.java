package com.techcrack.Annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.LocalDate;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String author() default "Kavin";
    int age() default 24;
}

@TaskInfo(author = "KavinAdithya", age = 27)
public class Annotations {

    @TaskInfo(author = "Dharani", age = 10)
    private final String name  = "Dharani";

    @TaskInfo(author = "Dharani1", age = 12)
    private final String name1  = "Dharani1";

    @TaskInfo(age = 13)
    private final String name2  = "Dharani2";

    @TaskInfo(author = "TechUniverse")
    private static String company = "Techcrack";

    @TaskInfo(author = "static Author")
    public static void author() {
        System.out.println("Static Author");
    }

    @TaskInfo(author = "Author")
    public static void authorObject() {
        System.out.println("Object Method Author");
    }

    public static void main(String[] args) {
        Annotation[] type = Annotations.class.getAnnotations();
        Annotations annotations = new Annotations();

        Field[] field = annotations.getClass().getDeclaredFields();

        Field[] fields = Annotation.class.getFields();

        Method[] methods1 = annotations.getClass().getDeclaredMethods();

        for (Method method : methods1) {
            System.out.println(method.getAnnotation(TaskInfo.class));
        }
//        Method[] methods = Annotations.class.getMethods();
//        for (Method method : methods) {
//            System.out.println(method.getAnnotation(TaskInfo.class));
//        }
////        for (Field field2 : fields) {
////            System.out.println(field2.getAnnotation(TaskInfo.class));
////        }
//        for (Field field1 : field) {
//            System.out.println(field1.getAnnotation(TaskInfo.class));
//        }
//
//        for (Annotation annotation : type) {
//            System.out.println(annotation);
//        }
    }
}
