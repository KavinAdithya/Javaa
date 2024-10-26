package com.techcrack.Annotation.Task;

import java.awt.desktop.SystemEventListener;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Validator {
    private User user;

    public Validator(User user) {
        this.user = user;
    }

    public void validate() throws NoSuchFieldException {
        if (user == null)
            throw new IllegalArgumentException("Object Was Null..");

        Class<? extends User> userClass = user.getClass();
        Field[] fields =  userClass.getDeclaredFields();
        Field field1 = userClass.getDeclaredField("email");
        for (Field field : fields)
            //System.out.println(Arrays.toString(field.getAnnotations()));
            System.out.println(field.getAnnotation(MinLength.class));

        System.out.println(Arrays.toString(field1.getAnnotations()));
    }

    private void validateEmail(Field field) {
        int minLength = field.getAnnotation(MinLength.class).minLength();
        int maxLength = field.getAnnotation(MaxLength.class).maxLength();
        String email = user.getEmail();

        if (email.length() < minLength)
            throw new ValidationException("Email length is too short...");
        if (email.length() > maxLength)
            throw new ValidationException("Email length is too large...");
    }

    private void validateUsername(Field field) {
        boolean isNull = field.getAnnotation(NotNull.class).isNull();
        int minLength = field.getAnnotation(MinLength.class).minLength();
        int maxLength = field.getAnnotation(MaxLength.class).maxLength();


    }

    public static void main(String[] args) throws NoSuchFieldException {
        Validator validator = new Validator(new User("Kavin", "KavinDharani@3", "Kavinadithya3@gmail.com"));
        validator.validate();
    }
}
