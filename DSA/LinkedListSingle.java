package com.techcrack.learnDSA;

public class LinkedListSingle {
	
	private Node head = null;
	private int size = 0;
	
	private boolean isInserted;
	
	private String list = "[]";
	
	public LinkedListSingle() {
		super();
	}
	
	// Adding Element to the List
	public void add(int data) {
		isInserted = true;
		
		Node node = new Node(data);
		
		if (head == null) head = node;
		else {
			Node last = lastNode();
			last.next = node;
		}
		size++;
	}
	
	// Helper Method
	private Node lastNode() {
		Node temp = head;
		
		while (temp != null && temp.next != null) temp = temp.next;
		
		return temp;
	}
	
	// Size of the array
	public int size() {
		return size;
	}
	
	// Getting value on index
	public int get(int index) {
		Node temp = findNode(index);
		return temp == null ? Integer.MIN_VALUE : temp.data;
	}
	
	// Helper Mode for get
	private Node findNode(int index) {
		Node temp = head;
		int count = 0;
		
		while (temp != null  && count < index && count + 1 < size) {
			temp = temp.next;
			count++;
		}
		
		return temp;
	}
	
	// Adding Element at index
	public void add(int index, int val) {
		isInserted = true;

		Node node = new Node(val);
		
		Node prevNode = findNode(index - 1);
		
		if (prevNode == head) {
			node.next = prevNode;
			head = node;
		}
		else {
			node.next = prevNode.next;
			prevNode.next = node;
		}
	}
	
	
	public boolean remove(int index) {
		if (index < 0 || index >= size)
			return false;
		
		isInserted = true;
	
		if (index == 0) {
			head = head.next;
			size--;
			return true;
		}
		
		Node prevNode = findNode(index - 1);
	
		prevNode.next = prevNode.next.next == null ? null : prevNode.next.next;
		
		size--;
		
		return true;
	}
	
	public boolean remove(Object val) {
		int index = index((int)val);
		
		return index == -1 ? false : remove(index);
	}
	
	public int index(int value) {
		int index = -1;
		
		Node temp = head;
		
		while (temp != null && temp.data != value) {
			temp = temp.next;
			index++;
		}
		
		return temp != null ? index + 1 : -1;
	}
	
	/**
	 *  List Returning
	 *  Caching Mechanism implemented to avoid regenerate 
	 *  the String to optimize the performance.
	 */ 
	@Override
	public String toString() {
		return isInserted ? values() : list;
	}
	
	// Helper Method for toString 
	private String values() {
		isInserted = false;
		
		Node temp = head;
		
		StringBuilder values = new StringBuilder();
		
		values.append("[");
		
		while (temp != null && temp.next != null) {
			values.append(temp.data + ", ");
			temp = temp.next;
		}
		
		String end = temp == null ? "]" : temp.data + "]";
		values.append(end);
		
		return this.list = values.toString();
	}
}
