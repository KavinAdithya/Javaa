package com.techcrack.generics;

// Used to Demonstrate the Upper-Bound WildCard
public class NumberBox <T extends Number>{
    // Instance Variable
    private T object;

    // Parameterized Constructor
    public NumberBox(T object) {
        this.object = object;
    }

    // Updating the instance Variable
    public void setObject(T object) {
        this.object = object;
    }

    // Retrieving the instance variable value
    public T getObject() {
        return object;
    }

    // Driver method for Demonstration
    public static void main(String[] args) {
        NumberBox<? extends Number> numberBox = new NumberBox<>(12);
        // numberBox.setObject(1); not Allowed due to type safety

        // read-Only
        System.out.println(numberBox.getObject());
    }

}
