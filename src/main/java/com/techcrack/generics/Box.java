package com.techcrack.generics;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Number> {
    private final T object;
    public Box(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public static <T>void printObject(List<?> object) {
        object.add(null);
        System.out.println(object);
    }
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(55);

        List<Integer> list = new ArrayList<>();
        Box.printObject(list);
    }
}
