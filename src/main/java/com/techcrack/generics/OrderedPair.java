package com.techcrack.generics;

public class OrderedPair<K, V extends Number> implements Pair<K, V>{
    private final K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public V getValue() {
        System.out.println(value.byteValue());
        return value;
    }

    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new OrderedPair<>(1, 55);
        Pair<Integer, Integer> pair1 = new OrderedPair<>(2, 89);
        System.out.println(pair.getValue());
        pair.setValue(90);
        System.out.println(pair1.getValue());
        System.out.println(pair.getValue());
    }
}
