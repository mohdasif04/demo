package com.java8.feature;

import java.util.Arrays;
import java.util.List;

public class PersonRepo {

	public static List<Person> getAllPerson() {

		Person p1 = new Person("asif", 165, 2000, "Male", 2, Arrays.asList("cricket", "swimming", "football"));
		Person p2 = new Person("rishab", 157, 2500, "Female", 3, Arrays.asList("swimming", "hockey", "race"));
		Person p3 = new Person("rhea", 158, 5200, "Female", 1, Arrays.asList("badminton", "tennis", "baseball"));
		Person p4 = new Person("Angelina", 160, 4000, "Female", 3, Arrays.asList("cricket", "hockey", "tennis"));
		Person p5 = new Person("Donald", 170, 5000, "Male", 2, Arrays.asList("baseball", "cricket", "swimming"));
		Person p6 = new Person("nancy", 169, 6500, "Female", 1, Arrays.asList("tennis", "baseball", "hockey"));

		return Arrays.asList(p1, p2, p3, p4, p5, p6);

	}

	public static Person getPersonDetails() {

		return new Person("asif", 165, 2000, "Male", 2, Arrays.asList("cricket", "swimming", "football"));

	}

}
