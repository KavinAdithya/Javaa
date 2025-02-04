package com.techcrack.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.CONSTRUCTOR ,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME) 
@Repeatable(Days.class)
public @interface WorkDay {
	String value() default "Sunday";
}