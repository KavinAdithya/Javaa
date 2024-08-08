package com.techcrack.Generics;

public class MyNode extends Node<Integer> {
    MyNode(Integer data) {
        super(data);
    }

    @Override
    public void setData(Integer data) {
        System.out.println("MyNode.data");
        super.setData(data);
    }

    public static void main(String[] args) {
        MyNode myNode = new MyNode(12);
        myNode.setData(89);

//        Node<Integer> node = myNode;
//
//        node.setData(67);
//
//        Integer data = (Integer)node.data;

       // System.out.println(data);
    }

}
