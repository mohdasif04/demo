package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Shuffle_Collections {

	public static void main(String[] args) {

		ArrayList<String> array_list = new ArrayList<String>();

		array_list.add("Monday");
		array_list.add("Tuesday");
		array_list.add("Wednesday");
		array_list.add("Thursday");
		array_list.add("Friday");
		array_list.add("Saturday");
		array_list.add("Sunday");

		Iterator<String> itr = array_list.iterator();

		while (itr.hasNext()) {

			System.out.println("using iterator " + itr.next());
		}

		Collections.shuffle(array_list);

		System.out.println("Collections after shuffle ::: " + array_list);

	}

}
