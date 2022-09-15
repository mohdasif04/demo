
package com.interview;

public class Add_Two_Number {

	public int add1(int a, long b) {
		return (int) (a + b);
	}

	public int add(long a, int b) {
		return (int) (a + b);
	}

	public static void main(String[] args) {

		Add_Two_Number number = new Add_Two_Number();

		number.add(4, 5);

		System.out.println(number);

	}

}
