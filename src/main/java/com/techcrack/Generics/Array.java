package com.techcrack.Generics;

public class Array<T> {
    T[] t;

    public void printArray() {
        t = (T[]) new Object[10];

    }

    public T getValue(int index) {
        return t[index];
    }
    public void setValue(int index, Object value) {
        t[index] = (T)value;
    }
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        array.printArray();
        array.setValue(0, "jkk");
        array.setValue(1,122);

        System.out.println(array.getValue(0) + " " + array.getValue(1));
    }
}
