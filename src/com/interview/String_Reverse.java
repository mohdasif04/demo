package com.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Reverse {

	public static void main(String[] args) {

		String str = "";

		System.out.println("Enter the input string ");

		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			str = reader.readLine();
			char[] chars = str.toCharArray();

			for (int i = chars.length - 1; i >= 0; i--)
				System.out.println(chars[i]);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
