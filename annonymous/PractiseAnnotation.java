package com.techcrack.java;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

@WorkDay
@WorkDay("Tuesday")
@WorkDay("Wednesday")
@WorkDay("Thursday")
public class PractiseAnnotation {
	
	@Dummy("Spring Boot")
	@WorkDay("Monday")
	@WorkDay("Thursday")
	public PractiseAnnotation() {
		super();
	}
	
	@WorkDay("Monday")
	@WorkDay("Thursday")
	public PractiseAnnotation(String name) {
		super();
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<?> clazz = PractiseAnnotation.class;
		
		@SuppressWarnings("unused")
		Annotation[] annotations = clazz.getAnnotations();
		
		Constructor<?> construct = clazz.getDeclaredConstructor();
		
		@SuppressWarnings("rawtypes")
		Constructor[] c = clazz.getConstructors();
		
		
		@SuppressWarnings("unused")
		Annotation[] annots = construct.getAnnotations();
		
//		for (Annotation a : annotations) {
//			for (WorkDay day : ((Days)a).value()) {
//				System.out.println(day.value());
//			}
//		}
		
		
		
		Method[] methods = clazz.getDeclaredMethods();
		for (Method m : methods) {
//			for (Parameter p : m.getParameters())
//				System.out.println(p)
		}
		
		for (Constructor<?> c1 : c) {  
			for (Annotation a
					
					
					
					
					
					
					: c1.getAnnotations()) {
				if (a instanceof Days)
					System.out.println(Arrays.toString(((Days)(a)).value()));
			}
		}
	}
	
	static void println(int n, int a) {
		int c = 10;
		int d = 20;
		int c1 = 10;
		int d1 = 20;
	}

}
