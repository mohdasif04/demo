package com.interview;

public class Client {

	static void doCalc(byte... a) {
		System.out.print("byte...");
	}

	
	static void doCalc(Byte s1, Byte s2) {
		System.out.print("Byte, Byte");
	}
	
	static void doCalc(long a, long b) {
		System.out.print("long, long");
	}


	public static void main(String[] args) {
		byte b = 52;
		byte a = 4;
		
		doCalc(b, b);

		doCalc(a, a);
	}
}
