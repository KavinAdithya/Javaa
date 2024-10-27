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

        for (Field field : userClass.getDeclaredFields()) {

            String value = findValue(findValue(field.getName()));

//            if (!(field.getClass() instanceof String))

            if (value.equals("No Attribute..."))
                throw new ValidationException("Annotation are Not permitted for this variables...");

            if (field.isAnnotationPresent(NotNull.class))
                validateNull(field, value);
            if (field.isAnnotationPresent(MaxLength.class))
                validateMaximumLength(field, value);
            if (field.isAnnotationPresent(MinLength.class))
                validateMinimumLength(field, value);
        }
    }

    private void validateNull(Field field, String value) {
        boolean isNull = field.getAnnotation(NotNull.class).isNull();

        if (!isNull && value.isEmpty())
            throw new ValidationException("Null Value Not Allowed...");

    }

    private void validateMaximumLength(Field field, String value) {
        int maxLength = field.getAnnotation(MaxLength.class).maxLength();

        if (maxLength < value.length())
            throw new ValidationException("Length is too long...");

    }

    private void validateMinimumLength(Field field, String value) {
        int minLength = field.getAnnotation(MinLength.class).minLength();

        if (minLength > value.length())
            throw new ValidationException("Length id too short...");
    }

    private String findValue(String value) {
        return switch (value) {
          case "email" -> user.getEmail();
          case "username" -> user.getName();
          case "password" -> user.getPassword();
            default -> "No Attribute...";
        };
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Validator validator = new Validator(new User("Kavin", "KavinDharani@3", "Kavinadithya3@gmail.com"));
        validator.validate();
    }
}
