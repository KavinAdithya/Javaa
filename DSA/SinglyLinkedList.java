package com.techcrack.learnDSA;

//import java.util.LinkedList;

public class SinglyLinkedList {
	public static void main(String[] args) {
//		var list = new LinkedList<Integer>();
		
		var list = new LinkedListSingle();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
//		System.out.println(list);
//		System.out.println("Size : " + list.size());
//		System.out.println("Index Value : " + list.get(4));
//		
//		// Last Node added out of size
//		list.add(7, -1);
		
		System.out.println(list);
		
//		System.out.println(list.remove(3));
		
//		System.out.println(list.index(5));
		
		System.out.println(list.remove((Object)1));
		
		System.out.println(list);
		
		System.out.println(list.size());
	}
}
