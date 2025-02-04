package com.techcrack.learnDSA;

public class HexaConversion {
	static void convertToHexaTest(int num) {
		System.out.println((0xf) + " " + num + " " + toBinary(0xf));
		System.out.println((15) + " " + num + " " + toBinary(15));
		System.out.println((num & 15) + " " + num + " " + toBinary(num & 15));
		System.out.println((num >> 4) + " " + num + " " + toBinary(num >> 4 ));
		System.out.println((num >>> 4) + " " + num + " " + toBinary(num >>> 4));
		System.out.println((num >> 4 >> 4) + " " + num + " " + toBinary(num >> 4 >> 4));
		System.out.println((num >>> 4 >>> 4) + " " + num + " " + toBinary(num >>> 4 >>> 4));
		
		
		System.out.println(((num >> 4) & 15) + " " + num + " " + toBinary(num >> 4 ));
		System.out.println(((num >>> 4) & 15) + " " + num + " " + toBinary(num >>> 4));
		System.out.println(((num >> 4 >> 4) & 15) + " " + num + " " + toBinary(num >> 4 >> 4));
		System.out.println(((num >>> 4 >>> 4) & 15) + " " + num + " " + toBinary(num >>> 4 >>> 4));
	}
	
	public static String toBinary(int num) {
		return String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
	}
	
	public static void main(String[] args) {
//		convertToHexaTest(-1);
		System.out.println(toHex(26));
	}
	
	public static String toHex(int num) {
		if (num == 0) return "0";
		
		char[] hexArr = "0123456778abcdef".toCharArray();
		
		StringBuilder hex = new StringBuilder();
		
		for (int i = 0; i < 8; i++) {
			int nibble = num & 0xf;
			
			hex.insert(0, hexArr[nibble]);
			
			num >>>= 4;
		}
		
		while (hex.length() > 1 && hex.charAt(0) == '0') hex.deleteCharAt(0);
		
		return hex.toString();
	}
}
