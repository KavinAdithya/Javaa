package com.techcrack.Generics;

public class Node<T> {
    public  T data;

    Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }

}
