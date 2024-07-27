package com.techcrack.Generics;

// This Class is for example of raw types in generics
public class RawTypeExample <T> {
    // Generic Variable
    private T object;

    // Parameterized Constructor
    public RawTypeExample(T object) {
        this.object = object;
    }

    // Getters and Setters
    // Used to retrieve the instance state value
    public T getObject() {
        return object;
    }

    // @param object used to update the instance state
    public void setObject(T object) {
        this.object = object;
    }

    // Driver to demonstrate the raw types
    public static void main(String[] args) {
        // No type safety compiler cannot ensures type safety at compile time
        RawTypeExample rawTypeExample = new RawTypeExample("Kavin");
        System.out.println(rawTypeExample.getObject());

        // Due to Not explicitly mentioning the type compiler cannot ensure the actual type of generic variable
        rawTypeExample.setObject(90);

        // Avoid using the raw types to avoid runtime errors and misbehavior of the code
        System.out.println(rawTypeExample.getObject());

        // Using Diamond Operator and mentioning its actual type to ensure type safety
        RawTypeExample<Integer> rawTypeExample1 = new RawTypeExample<>(78);
        System.out.println(rawTypeExample.getObject());

        rawTypeExample1.setObject(90);
        System.out.println(rawTypeExample1.getObject());

        rawTypeExample1 = rawTypeExample;
        // Causes may run time error because the compiler doesn't ensure that the rawTypeExample type is Integer only

    }
}
