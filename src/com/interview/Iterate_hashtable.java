package com.interview;

import java.util.Enumeration;
import java.util.Hashtable;

public class Iterate_hashtable {

	public static void main(String[] args) {

		Hashtable hash_table = new Hashtable<>();

		hash_table.put("1", "Monday");
		hash_table.put("2", "Tuesday");
		hash_table.put("3", "Wednesday");
		hash_table.put("4", "Thursday");
		hash_table.put("5", "Friday");
		hash_table.put("6", "Satuday");
		hash_table.put("7", "Sunday");

		Enumeration enumeration_hash_table = hash_table.elements();

		while (enumeration_hash_table.hasMoreElements()) {
			System.out.println(enumeration_hash_table.nextElement());

		}

	}

}
