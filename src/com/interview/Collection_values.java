package com.interview;

import java.util.HashMap;

public class Collection_values {

	public static void main(String[] args) {

		HashMap<String, String> hash_map = new HashMap<String, String>();

		hash_map.put("1", "Monday");
		hash_map.put("2", "Tuesday");
		hash_map.put("3", "Wednesday");
		hash_map.put("4", "Thursday");
		hash_map.put("5", "Friday");

		System.out.println("Element of hash ma :: " + hash_map);

		// Collections values of hashmap

		System.out.println("Values of hashMap ::  " + hash_map.values());

		System.out.println("Keys of hashMap :: " + hash_map.keySet());

	}

}
