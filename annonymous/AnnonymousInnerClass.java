package com.techcrack.java;

class OuterClass {
	public void print(String s) {
		System.out.println("That's Great to here..");
	}
	
	class Inner<T extends String> {
		public void printName(T name) {
			print(name);
		}
	}
}

public class AnnonymousInnerClass {
	private OuterClass oc = new OuterClass();
	
	public void print(Object s) {
		oc.print((String)s);
	}
	public static void main(String[] args) {
		
	}
}
