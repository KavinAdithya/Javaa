package com.techcrack.java.annonymous;

public class JavaProgramming {
	private int releaseYear = 1995;
	
	public void runMethod() {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable Interface using java version " + releaseYear);
			}
		};
		
		run.run();
	}
	
	public static void main(String[] args) {
//		AbstractClass lan = new AbstractClass() {
//			@Override
//			public void printReleaseYear() {
//				System.out.println(getLanguage() + " Released year : " + releaseYear);
//			}
//		};
		
		var pro = new JavaProgramming();
		pro.runMethod();
//		lan.printReleaseYear();
	}
}
