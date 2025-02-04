package com.techcrack.java;

public class Encapsulation {
	private int x;
	
	public Encapsulation(int x) {
		this.x = x;
	}
	
	static int getX(Encapsulation outer) {
		return outer.x;
	}
	
	public static void main(String[] args) {
		var e = new Encapsulation(14);
		
		System.out.println(getX(e));
	}
}
