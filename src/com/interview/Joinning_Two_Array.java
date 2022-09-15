package com.interview;

import java.util.ArrayList;

public class Joinning_Two_Array {

	public static void main(String[] args) {

		ArrayList<String> list_1 = new ArrayList<String>();
		list_1.add("Monday");
		list_1.add("Tuesday");
		list_1.add("Wednesday");
		list_1.add("Thursday");

		System.out.println(" First List :::  " + list_1);

		ArrayList<String> list_2 = new ArrayList<String>();
		list_2.add("Friday");
		list_2.add("Saturday");
		list_2.add("Sunday");

		System.out.println(" Second List :::  " + list_2);

		ArrayList<String> joined_list = new ArrayList<String>();

		joined_list.addAll(list_1);
		joined_list.addAll(list_2);

		System.out.println("The elements of joined arraylist is as follows :: " + joined_list);

	}

}
