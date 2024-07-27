package com.techcrack.Generics;

// Generic Class Which accepts and any subtype of number class and stores the value
public class BoundedBox <T extends Number> {
    // Instance Variable type Of t Generic Variable
    private T value;

    // Parameterized Constructor used to initialize the value state during Objet creation.
    public BoundedBox(T value) {
        this.value = value;
    }

    // Retrieving the value
    // @Return returning the state value
    public T getValue() {
        return value;
    }

    // @Param value is used to update the value state
    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        BoundedBox<Number> boundedBox = new BoundedBox<>(45);
        BoundedBox<Integer> boundedBox1 = new BoundedBox<>(67);
        BoundedBox<Double> boundedBox2 = new BoundedBox<>(78.0);
        BoundedBox<Number> boundedBox3 = new BoundedBox<>(78.90);

        System.out.println(boundedBox1.getValue());
        boundedBox1.setValue(9);
        System.out.println(boundedBox1.getValue());

        System.out.println(boundedBox.getValue());
        boundedBox.setValue(8.90);
        System.out.println(boundedBox.getValue());

        System.out.println(boundedBox2.getValue());
        boundedBox2.setValue(9.5);
        System.out.println(boundedBox2.getValue());

        System.out.println(boundedBox3.getValue());
        boundedBox3.setValue(989);
        System.out.println(boundedBox3.getValue());
    }
}
