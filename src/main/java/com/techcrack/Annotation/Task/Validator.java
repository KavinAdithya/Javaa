package com.techcrack.Annotation.Task;

import java.lang.reflect.Field;

public class Validator {
    private final Object objectToValidate;

    public Validator(Object objectToValidate) {
        this.objectToValidate = objectToValidate;
    }

    public void validate() throws NoSuchFieldException {
        if (objectToValidate == null)
            throw new IllegalArgumentException("Object Was Null..");

        Class<?> userClass = objectToValidate.getClass();

        for (Field field : userClass.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                String value = (String) field.get(objectToValidate);
                if (field.isAnnotationPresent(NotNull.class))
                    validateNull(field, value);

                if (field.getAnnotation(NotNull.class).isNull())
                    continue;

                if (field.isAnnotationPresent(MaxLength.class))
                    validateMaximumLength(field, value);

                if (field.isAnnotationPresent(MinLength.class))
                    validateMinimumLength(field, value);
            }
            catch(IllegalAccessException e) {
                throw new NoSuchFieldException("Failed to access " + field.getName());
            }
        }

        System.out.println("Object is Validated Successfully..");
    }

    private void validateNull(Field field, String value) {
        boolean isNull = field.getAnnotation(NotNull.class).isNull();

        if (!isNull && value == null)
            throw new ValidationException(field.getName() + " Cannot be null...");

    }

    private void validateMaximumLength(Field field, String value) {
        MaxLength maxLength = field.getAnnotation(MaxLength.class);

        if (maxLength.maxLength() < value.length())
            throw new ValidationException(value + " must not exceed " + maxLength.maxLength());

    }

    private void validateMinimumLength(Field field, String value) {
        MinLength minLength = field.getAnnotation(MinLength.class);

        if (minLength.minLength() > value.length())
            throw new ValidationException(value + " must be at least " + minLength.minLength());
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Validator validator = new Validator(new User("kavin", "KavinDharani@3", "Kavinadithya3@gmail.com"));
        validator.validate();
    }
}
