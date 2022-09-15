package com.interview;

import java.util.Arrays;
import java.util.List;

public class Convert_Array_To_Collection {

	public static void main(String[] args) {

		String sample_array[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		int length_Array = sample_array.length;

		for (int i = 0; i < length_Array; i++) {
			System.out.println(sample_array[i] + " ");
		}

		System.out.println();

		List converted_list = Arrays.asList(sample_array);

		System.out.println("The converted list is as follows :::  " + converted_list);

	}

}
